import java.lang.Math;

class Darts {
    int score(double xOfDart, double yOfDart) {
        double radius = Math.sqrt(
            Math.pow(xOfDart,2)+
            Math.pow(yOfDart,2));
        if(radius <= 1.0d) return 10;
        if(radius <= 5.0d) return 5;
        if(radius <= 10.0d) return 1;
        return 0;
    }
}
