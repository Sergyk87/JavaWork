package Second4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class Logging {
    static Logger logger = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

            System.out.println(Arrays.toString(logger.getHandlers()));
            // logger.removeHandler(logger.getHandlers()[0]);
            logger.setUseParentHandlers(false);
            FileHandler handler = new FileHandler("file.log");
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);

            for (int i = 0; i < list.size(); i++) {
                logger.log(Level.INFO, String.format("%d", i));
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}