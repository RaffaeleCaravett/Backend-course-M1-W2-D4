package raffaelecaravetta;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        File file = new File("src/output.txt");
        List<Product> products = new ArrayList<>();
        final ArrayList<String>[] contentArray = new ArrayList[]{new ArrayList<>()};
        for(int i =0;i<=100;i++){
            Product product = new Product("NomeProdotto"+i,"CategoriaProdotto"+i,"PrezzoProdotto"+i);
            products.add(product);
        }



            products.forEach(product -> {
                    try {
                        FileUtils.writeStringToFile(file, product.getName()+"@"+product.getCategory()+"@"+product.getPrice()
                            + "#", StandardCharsets.UTF_8, true);


                        String contenuto = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

                        leggiProdottiDaDisco(contentArray[0],contenuto);

                        contentArray[0].forEach(System.out::println);


                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            );


    }


    private static void leggiProdottiDaDisco(ArrayList arrayList,String contenuto){
        String[] parts = contenuto.split("#");

        for(int i =0 ;i<=99;i++){
            arrayList.add(parts[i]);
        }


    }
}
