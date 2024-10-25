package alvarenga.brandao.galeriapublica;

import android.content.Context;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GalleryRepository {
    Context context;

    public GalleryRepository(Context context) {
        this.context = context;
    }

    public List<ImageData> loadImageData(Integer Limit, Integer offSet) throws FileNotFoundException {
        List<ImageData> imageDataList = new ArrayList<>();

        int w = (int) context.getResources().getDimension(R.dimen.im_width);
    }
}
