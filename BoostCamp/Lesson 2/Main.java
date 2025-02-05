package OOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
         computer1.setName("HP");
         computer1.setModel("Victus");
         computer1.setCpu("Ryzen5-5600H");
         computer1.setRam("8 Gb");
         computer1.setMemory("512 Gb SSD");
         computer1.setPrice(1356.69);
         computer1.setDiscountPercent(24.0);
         computer1.setCoupon(0.0);
         
         Computer computer2 = new Computer();
         computer2.setName("Zeiron");
         computer2.setModel("Omen X50");
         computer2.setCpu("i5- 3470");
         computer2.setRam("16 GB");
         computer2.setMemory("256 Gb SSD");
         computer2.setGraphicsCardCapacity("4GB GT730 ");
         computer2.setPrice(389.54);
         computer2.setCoupon(5.0);
        
         Computer computer3 = new Computer();
         computer3.setName("Apple");
         computer3.setModel("Macbook");
         computer3.setCpu("M1 Chip");
         computer3.setRam("8 GB");
         computer3.setMemory("256 Gb SSD");
         computer3.setPrice(1641.70);
         computer3.setDiscount(1.02);
         
         Computer computer4 = new Computer();
         computer4.setName("RaXius");
         computer4.setModel("Business");
         computer4.setCpu("i3");
         computer4.setRam("64 GB");
         computer4.setMemory("1 TB SSD");
         computer4.setPrice(922.29);
         computer4.setDiscountPercent(0.0);

        
         Computer[] computers = {computer1, computer2, computer3, computer4};
         for (Computer computer : computers) {
          System.out.println(computer.getName());
             computer.addToWishList();
         }

         for (Computer computer: computers){
          Computer.showDiscount(computer.getPrice(),computer.getDiscountPercent(),computer.getCoupon(),computer.getDiscount());
         }
    }
}
