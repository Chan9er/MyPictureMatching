package cn.oyp.link.view;

import android.graphics.Bitmap;

/**
 * ��װͼƬID��ͼƬ����Ĺ����� <br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */
public class PieceImage {
	/**
	 * ͼƬ
	 */
	private Bitmap image;
	/**
	 * ͼƬ��ԴID
	 */
	private int imageId;

	/**
	 * ���캯��
	 * 
	 * @param image
	 *            ͼƬ
	 * @param imageId
	 *            ͼƬID
	 */
	public PieceImage(Bitmap image, int imageId) {
		super();
		this.image = image;
		this.imageId = imageId;
	}

	/**
	 * @return ͼƬ
	 */
	public Bitmap getImage() {
		return image;
	}

	/**
	 * ����ͼƬ
	 * 
	 * @param image
	 */
	public void setImage(Bitmap image) {
		this.image = image;
	}

	/**
	 * @return ͼƬID
	 */
	public int getImageId() {
		return imageId;
	}

	/**
	 * ����ͼƬID
	 * 
	 * @param imageId
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
}
