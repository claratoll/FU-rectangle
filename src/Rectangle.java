public class Rectangle {


        /*
        Skapa en klass Rectangle enligt nedan samt skriv ett program som använder din Rectangle-klass
har fyra instansvariabler: x, y, width och height
har tre konstruktörer
en som inte tar emot ngt och som sätter alla instansvariabler till 0
en som tar emot två värden som sätts in i width och height medan x och y sätts till 0
en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
en instansmetod calculateArea som returnerar en double med rektangelns area
en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets
en instansmetod setXY som låter dig sätta instansvariablerna x och y
två instansmetoder setWidth och setHeight som låter dig sätta motsvarande instansvariabler

Lägg till en metod checkCollision i Rectangle-klassen som tittar på två rektanglar om det finns överlapp.
Instansvariablerna x och y refererar till övre vänstra hörnet på en rektangel.

         */

    public int x;
    public int y;
    public int width;
    public int height;


    public Rectangle (){
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    public Rectangle (int bredd, int hojd){
        x = 0;
        y = 0;
        width = bredd;
        height = hojd;
    }

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculateArea(double width, double height){
        //en instansmetod calculateArea som returnerar en double med rektangelns area
        double area = width * height;
        return area;
    }

    public double calcArea(){
        double area = this.width * this.height;
        return area;
    }

    //en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets
    public double calculatePerimeter(){
        double omkrets = this.height + this.height + this.width + this.width;
        return omkrets;
    }

   // en instansmetod setXY som låter dig sätta instansvariablerna x och y
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getXY() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
