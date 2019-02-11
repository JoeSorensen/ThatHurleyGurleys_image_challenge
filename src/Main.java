public class Main {
    public static void main(String [] args) {
        Image inputImage = new Image("odds_and_evens.png");
        Image outputImage = new Image(inputImage.getWidth(), inputImage.getHeight());

        System.out.println("Picture is " + inputImage.getWidth() + " pixels wide");
        System.out.println("Picture is " + inputImage.getHeight() + " pixels tall");

        for(int i=0; i<inputImage.getHeight(); i++) {
            for (int j = 0; j < inputImage.getWidth(); j++) {
                // Copy pixel from input image
                Pixel inputPixel = inputImage.getPixel(i, j);

                if(inputPixel.red % 2 != 0 && inputPixel.green % 2 != 0 && inputPixel.blue % 2 != 0) {
                    outputImage.setPixel(i, j, inputPixel.red, inputPixel.green, inputPixel.blue);
                }
            }
        }

        // Write the output image
        outputImage.write("output.png");
    }
}
