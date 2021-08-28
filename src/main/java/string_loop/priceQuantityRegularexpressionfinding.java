package string_loop;
/*
Program for finding total price and total quantity using regular expression.
where 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.

*/


public class priceQuantityRegularexpressionfinding {
    public static void main(String[] args) {

        String str = "1 piece share 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));


        double shareQuantity = Double.parseDouble(arr[0]);
        double sharePrice = Double.parseDouble(arr[1]);
        double shirtQuantity = Double.parseDouble(arr[2]);
        double shirtPrice = Double.parseDouble(arr[3]);
        double pantQuantity = Double.parseDouble(arr[4]);
        double pantPrice = Double.parseDouble(arr[5]);

        double totalQuantity = (shareQuantity + shirtQuantity + pantQuantity);
        double totalPrice = ((shareQuantity * sharePrice) + (shirtQuantity * shirtPrice) + (pantQuantity * pantPrice));


        System.out.println("Total Quantity: "+totalQuantity);
        System.out.println("Total Price: "+totalPrice);





    }
}
