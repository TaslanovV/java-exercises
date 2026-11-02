//Excercise 1

// class Animal {
//
//     String name;
//
//     Animal(String name) {
//         this.name = name;
//     }
//
//     void Speak() {
//         IO.println("Some Sound");
//     }
// }
//
// class Cat extends Animal {
//
//     Cat(String name) {
//         super(name);
//     }
//
//     @Override
//     void Speak() {
//         IO.println("meow");
//     }
// }
//
// class Dog extends Animal {
//     Dog(String name){
//         super(name);
//     }
//     @Override
//     void Speak() {
//         IO.println("Woof");
//     }
// }
//
// void main() {
//     Animal[] zoo = {new Cat("Jerry"), new Dog("Scoob"), new Animal("Generic")};
//     for (Animal x : zoo){
//         x.Speak();
//         IO.println(x.name);
//     }
// }


class shape{
    double area(){
        return 0;
    }
}


class circle extends shape{
    double radius;
    circle(double radius){
        this.radius = radius;

    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

class rectangle extends shape{
    double width;
    double height;

    rectangle(double width, double height){
       this.width = width;
       this.height = height;
    }
    @Override
    double area(){
        return width*height;
    }
}

void main(){
    shape[] shapes = {new circle(6), new rectangle(12, 6)};
    for(shape s: shapes){
        IO.println(s.area());
    }
}
