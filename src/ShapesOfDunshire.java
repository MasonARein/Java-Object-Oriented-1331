public class ShapesOfDunshire {
    public static void main(String[] args) {
        double finalVolume = 0;
        int numPieces = (int)(Math.random()*10+10);
        System.out.println("Creating Shapes of Dunshire game with " + numPieces + " pieces.");
        for(int repeat = 0; repeat < numPieces; repeat++){
            int shapeType = (int)(Math.random()*3+1);
            double radius = (int)((Math.random() * 5 + 5)*100)/100.0;
            double height = (int)((Math.random() * 5+7)*100)/100.0;
            double volume;
            switch(shapeType){
                case 1:
                    volume = Math.round((4/3.0)*Math.PI*Math.pow(radius, 3.0)*100)/100.0;
                    finalVolume += volume;
                    System.out.println("Manufacturing shape of type: " + shapeType + " and volume: " + volume + " cm3. Dimensions: radius = " + radius + " cm.");
                    break;
                case 2:
                    volume = Math.round(Math.PI * Math.pow(radius,2) * height * 100)/100.0;
                    finalVolume += volume;
                    System.out.println("Manufacturing shape of type: " + shapeType + " and volume: " + volume + " cm3. Dimensions: radius = " + radius + " cm and height = " + height + " cm.");
                    break;
                case 3:
                    volume = Math.round((1/3.0)*Math.PI*height*Math.pow(radius,2)*100)/100.0;
                    finalVolume += volume;
                    System.out.println("Manufacturing shape of type: " + shapeType + " and volume: " + volume + " cm3. Dimensions: radius = " + radius + " cm and height = " + height + " cm.");
                    break;
            }
        }
        double price = Math.round(finalVolume * 0.55 * 100)/100.0;
        System.out.println("Total cost of manufacturing " + numPieces + " pieces, worth " + finalVolume + " cm3 plastic, is $" + price + ".");
    }
}
