import org.junit.jupiter.api.Test;

public class ObjectsOnTheTable {
    @Test
    public void workingWithObjects() {
        Book myBook = new Book();

        myBook.setColor("green");
        myBook.setTotalPrice(2.99);
        myBook.setWeight(0.3);
        myBook.setWidth(0.03);
        myBook.setNumberOfPages(180);

        System.out.println("my book:");
        System.out.println(myBook.getColor());
        System.out.println(myBook.getTotalPrice());
        System.out.println(myBook.getWeight());
        System.out.println(myBook.getWidth());
        System.out.println(myBook.getNumberOfPages());

        Cat myCat = new Cat();

        myCat.setAge(4);
        myCat.setColor("black");
        myCat.setCatABoy(true);
        myCat.setHeight(0.5);
        myCat.setWeight(1.2);

        System.out.println("my cat:");
        System.out.println(myCat.getAge());
        System.out.println(myCat.getColor());
        System.out.println(myCat.isCatABoy());
        System.out.println(myCat.getHeight());
        System.out.println(myCat.getWeight());

        Cup myCup = new Cup();

        myCup.setCapacity(0.3);
        myCup.setContent("water");
        myCup.setWeight(0.4);
        myCup.setMaterial("glass");
        myCup.setLiquidInside(true);

        System.out.println("my cup:");
        System.out.println(myCup.getCapacity());
        System.out.println(myCup.getContent());
        System.out.println(myCup.getWeight());
        System.out.println(myCup.getMaterial());
        System.out.println(myCup.isLiquidInside());

        Lamp myLamp = new Lamp();

        myLamp.setColor("black");
        myLamp.setHeight(0.4);
        myLamp.setTotalPrice(8);
        myLamp.setWeight(1.5);
        myLamp.setType("Swing arm lamp");

        System.out.println("my lamp:");
        System.out.println(myLamp.getColor());
        System.out.println(myLamp.getHeight());
        System.out.println(myLamp.getTotalPrice());
        System.out.println(myLamp.getWeight());
        System.out.println(myLamp.getType());

        Loudspeaker myLoudspeaker = new Loudspeaker();

        myLoudspeaker.setColor("black");
        myLoudspeaker.setFirm("logitech");
        myLoudspeaker.setType("bookshelf speakers");
        myLoudspeaker.setQuantity(2);
        myLoudspeaker.setTotalPrice(39.99);

        System.out.println("my loudspeakers:");
        System.out.println(myLoudspeaker.getColor());
        System.out.println(myLoudspeaker.getFirm());
        System.out.println(myLoudspeaker.getType());
        System.out.println(myLoudspeaker.getQuantity());
        System.out.println(myLoudspeaker.getTotalPrice());

        Pen myPen = new Pen();

        myPen.setColor("blue");
        myPen.setMaterial("plastic");
        myPen.setHeight(0.13);
        myPen.setWeight(0.04);
        myPen.setTotalPrice(0.2);

        System.out.println("my pen:");
        System.out.println(myPen.getColor());
        System.out.println(myPen.getMaterial());
        System.out.println(myPen.getHeight());
        System.out.println(myPen.getWeight());
        System.out.println(myPen.getTotalPrice());

        Phone myPhone = new Phone();

        myPhone.setColor("black");
        myPhone.setHeight(0.16);
        myPhone.setWeight(0.3);
        myPhone.setWidth(0.005);
        myPhone.setTotalPrice(178.95);

        System.out.println("my phone:");
        System.out.println(myPhone.getColor());
        System.out.println(myPhone.getHeight());
        System.out.println(myPhone.getWeight());
        System.out.println(myPhone.getWidth());
        System.out.println(myPhone.getTotalPrice());

        Printer myPrinter = new Printer();

        myPrinter.setColor("white");
        myPrinter.setFirm("HP");
        myPrinter.setType("laser");
        myPrinter.setWeight(15.5);
        myPrinter.setTotalPrice(129.99);

        System.out.println("my printer:");
        System.out.println(myPrinter.getColor());
        System.out.println(myPrinter.getFirm());
        System.out.println(myPrinter.getType());
        System.out.println(myPrinter.getWeight());
        System.out.println(myPrinter.getTotalPrice());

        Wallet myWallet = new Wallet();

        myWallet.setContent("cards, coins, banknotes");
        myWallet.setFirm("Valentini");
        myWallet.setMaterial("leather");
        myWallet.setColor("black");
        myWallet.setTotalPrice(19.99);

        System.out.println("my wallet:");
        System.out.println(myWallet.getContent());
        System.out.println(myWallet.getFirm());
        System.out.println(myWallet.getMaterial());
        System.out.println(myWallet.getColor());
        System.out.println(myWallet.getTotalPrice());

        Webcam myWebcam = new Webcam();

        myWebcam.setFirm("logitech");
        myWebcam.setColor("grey");
        myWebcam.setType("standalone");
        myWebcam.setTotalPrice(10.99);
        myWebcam.setButtonQuantity(1);

        System.out.println("my webcam:");
        System.out.println(myWebcam.getFirm());
        System.out.println(myWebcam.getColor());
        System.out.println(myWebcam.getType());
        System.out.println(myWebcam.getTotalPrice());
        System.out.println(myWebcam.getButtonQuantity());

    }
}
