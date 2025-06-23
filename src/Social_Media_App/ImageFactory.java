package Social_Media_App;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {
    private static final Map<String, Image> imagePool = new HashMap<>();

    public static Image getImage(String fileName) {
        if (!imagePool.containsKey(fileName)) {
            imagePool.put(fileName, new SharedImage(fileName));
        }
        return imagePool.get(fileName);
    }
}
