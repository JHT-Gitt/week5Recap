package com.pluralsight;
import org.example.Main;
import java.util.Scanner;


public class Saiyan {

     String name;
     int powerLevel;
     int ki;
     boolean superSaiyan;
     int newPower;
     int newKi;

    Scanner scanner = new Scanner(System.in);

    public Saiyan(String _name, int _powerLevel, int _ki ){
        this.name = _name;
        this.powerLevel = _powerLevel;
        this.ki = _ki;
        this.superSaiyan = false;
    }
    public void displayInfo(){
        System.out.println("===== Saiyan Info Status ====");
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + this.powerLevel + "➡️➡️➡️" + newPower);
        System.out.println("Ki : " + this.ki + "➡️➡️➡️" + newKi);
        System.out.println("Can transform Super Saiyan: " + (superSaiyan ? "Yes 🔥" : "No"));
        System.out.println("========================= \n");
    }
    public void transform(){
        if (powerLevel >= 9000){
            this.superSaiyan = true;
            newPower *=2;
            System.out.println(this.name + " transformed into Super Saiyan !! 🙉 \nPower level is doubled to " + newPower);
        }else{
            System.out.println(this.name + " is not ready to transform yet");
        }
    }
    public void train(){

        this.powerLevel +=500;
        newPower = this.powerLevel;
        newKi = this.ki + 50;
        System.out.println(this.name + " is training hard !!! \nPower Level is now " + newPower + " 🔥🔥🔥");
        if (newPower >= 9000){
            System.out.println(this.name + " Power Level is over 9000 !!!!! \n*TRANSFORMINGGGG NOISE* \nAAAAAAAAAAAAAAHHHH ");
        }
    }
//    public void blast(Saiyan secondSaiyan){
//        if (this.newKi>=30){
//            this.newKi -=30;
//            secondSaiyan.newKi -=20;
//            System.out.println(this.name + " blasts " + secondSaiyan.name + " with a Kamehameha 💥💥💥");
//            System.out.println(secondSaiyan.name + "'s Ki drops to "+secondSaiyan.newKi);
//            System.out.println(this.name + "'s Ki is now "+this.newKi);
//        }else if (this.ki<30){
//            System.out.printf(this.name + " is too exhausted to use blast");
//        }
//    }
//    public void keepBlasting(Saiyan secondSaiyan, Saiyan firstSaiyan){
//        String kiBlast;
//        do {
//            System.out.println("\nKeep Blasting " + secondSaiyan.name + " ? [Y/N]");
//            kiBlast = scanner.next();
//            if (kiBlast.equals("y") || kiBlast.equals("Y")) {
//                if (firstSaiyan.newKi >= 30) {
//                    blast(secondSaiyan);
//                } else {
//                    System.out.println(firstSaiyan.name + " is too exhausted to use blast");
//                    break;
//                }
//            }else if (kiBlast.equals("n") || kiBlast.equals("N")) {
//                System.out.println("Sayonaraaaaa !!");
//                break;
//            }else{
//                System.out.println("Try again. Choose [Y/N] only.");
//            }
//        }while (!kiBlast.equals("y") || !kiBlast.equals("Y") || !kiBlast.equals("n") || !kiBlast.equals("N"));
//    }
    public void blasting(Saiyan firstSaiyan, Saiyan secondSaiyan){

        do{
            if(firstSaiyan.newKi >= 30 && secondSaiyan.newKi >=30){
                if(firstSaiyan.newKi >= 30) {
                    System.out.println(firstSaiyan.name + "'s turn !!!");
                    System.out.printf(firstSaiyan.name + " blasts " + secondSaiyan.name + " with Kamehameha 💥💥💥\n");
                    firstSaiyan.newKi -= 30;
                    secondSaiyan.newKi -= 20;
                    System.out.println(firstSaiyan.name + "'s Ki: " + firstSaiyan.newKi);
                    System.out.println(secondSaiyan.name + "'s Ki: " + secondSaiyan.newKi);
                    if(secondSaiyan.newKi < 30){
                        System.out.println(secondSaiyan.name + " don't have enough Ki to fire a blast");
                    }
                }
                if(secondSaiyan.newKi >=30 ){
                    System.out.println(secondSaiyan.name + "'s turn !!!");
                    System.out.printf(secondSaiyan.name +" blasts " +firstSaiyan.name + " with Fina Flash 💥💥💥\n");
                    firstSaiyan.newKi -=20;
                    secondSaiyan.newKi -=30;
                    System.out.println(firstSaiyan.name + "'s Ki: " + firstSaiyan.newKi);
                    System.out.println(secondSaiyan.name + "'s Ki: " + secondSaiyan.newKi);
                    if(firstSaiyan.newKi < 30){
                        System.out.println(firstSaiyan.name + " don't have enough Ki to fire a blast");
                    }
                }
            }else if(firstSaiyan.newKi >= 30 && secondSaiyan.newKi <30){
                System.out.println(firstSaiyan.name + "'s turn !!!");
                System.out.printf(firstSaiyan.name + " blasts " + secondSaiyan.name + " with Kamehameha 💥💥💥\n");
                firstSaiyan.newKi -= 30;
                secondSaiyan.newKi -= 20;
                if(secondSaiyan.newKi <30){
                    System.out.println(firstSaiyan.name + "'s Ki: " + firstSaiyan.newKi);
                    System.out.println(secondSaiyan.name + "'s Ki: " + secondSaiyan.newKi);
                    System.out.println(secondSaiyan.name +" exhausted all his Ki");
                    System.out.println(firstSaiyan.name + " won !!!\n");

                }
            }else if(firstSaiyan.newKi < 30 && secondSaiyan.newKi >=30) {
                System.out.println(secondSaiyan.name + "'s turn !!!");
                System.out.printf(secondSaiyan.name + " blasts " + firstSaiyan.name + " with Final Flash 💥💥💥\n");
                firstSaiyan.newKi -= 20;
                secondSaiyan.newKi -= 30;
                if (firstSaiyan.newKi < 30) {
                    System.out.println(firstSaiyan.name + "'s Ki: " + firstSaiyan.newKi);
                    System.out.println(secondSaiyan.name + "'s Ki: " + secondSaiyan.newKi);
                    System.out.println(firstSaiyan.name + " exhausted all his Ki");
                    System.out.println(secondSaiyan.name + " won !!!\n");
                }
            }else{
                System.out.println("battle is Draw !!");
            }



        }while(firstSaiyan.newKi >=30 || secondSaiyan.newKi >=30);

    }
    public void compareStrength(Saiyan firstSaiyan, Saiyan secondSaiyan){

        int stronger = Math.max(firstSaiyan.powerLevel, secondSaiyan.powerLevel);
//        System.out.println(stronger);
        if (firstSaiyan.powerLevel == stronger){
            System.out.println(firstSaiyan.name + " is stronger with Power Level of " + stronger);
        }else if (secondSaiyan.powerLevel == stronger){
            System.out.println(secondSaiyan.name + " is stronger with Power level of " + stronger);
        }
    }


}
