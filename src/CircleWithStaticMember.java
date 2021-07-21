public class CircleWithStaticMember {
    int radius;
    static int numberOfObjects;

    CircleWithStaticMember(){
        radius = 1;
        numberOfObjects ++;
    }

    CircleWithStaticMember(int newRadius){
        radius = newRadius;
        numberOfObjects ++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
