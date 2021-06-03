package swing.quiz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class S03_KakaoImageButton extends JFrame {
	
	public static final int RYON = 0;
	public static final int APHEACH = 1;
	public static final int MUJI = 2;
	public static final int TUBE = 3;
	
	private static HashMap<Integer, Image> btn_images = new HashMap<>();
	
	static {
		try {
			BufferedImage src = ImageIO.read(new File("./data/kakao.jpg"));
			
			btn_images.put(RYON, src.getSubimage(0, 0, 100, 100));
			btn_images.put(APHEACH, src.getSubimage(100, 0, 100, 100));
			btn_images.put(RYON, src.getSubimage(0, 100, 100, 100));
			btn_images.put(MUJI, src.getSubimage(100, 100, 100, 100));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public S03_KakaoImageButton(int picture, int x, int y, int width, int height) {
		setIcon(new ImageIcon(
					btn_images
					.get(picture)
					.getScaledInstance(width, height, Image.SCALE_DEFAULT))
				);
		setBounds(x, y, width, height);
		
	}
	
}
