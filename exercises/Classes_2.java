
//A small Java simulation where cars randomly accelerate, brake or hold their speed until they pass their top speed.


import java.util.Random;

class Car{

    String brand;
    int speed;
    int maxSpeed;
    Car(int maxSpeed, String brand){
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    void randomAction(){
        while (true){
            Random rand = new Random();
            int choice = rand.nextInt(3);
            if(choice == 1){
                accelerate();
            } else if(choice==2){
                brake();
            }

            if(speed > maxSpeed){
                break;

            }


        }
        printStatus();


    }

    void printStatus(){
        IO.println("The car is a "+brand+" and it is going "+speed);
    }

    void accelerate(){
        Random rands = new Random();
        speed += rands.nextInt(25);

    }

    void brake(){
        Random randb = new Random();
        speed -= randb.nextInt(7);
        if (speed < 0){
            speed = 0;
        }


    }
}








void main(){

    var car1 = new Car(248, "BMW");
    car1.randomAction();



    var car2 = new Car(236, "Mercedes");
    car2.randomAction();



}
