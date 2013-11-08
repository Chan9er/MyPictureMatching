package cn.oyp.link.view;

import android.graphics.Point;

/**
 * ��������Ϸ�еķ������ <br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */
public class Piece {
	/**
	 * ���淽����������Ӧ��ͼƬ
	 */
	private PieceImage pieceImage;
	/**
	 * �÷�������Ͻǵ�x����
	 */
	private int beginX;
	/**
	 * �÷�������Ͻǵ�y����
	 */
	private int beginY;
	/**
	 * �ö�����Piece[][]�����е�һά������ֵ
	 */
	private int indexX;
	/**
	 * �ö�����Piece[][]�����еڶ�ά������ֵ
	 */
	private int indexY;

	/**
	 * ���ø�Piece�����������е�����ֵ
	 * 
	 * @param indexX
	 *            �÷�������Ͻǵ�x����
	 * @param indexY
	 *            �÷�������Ͻǵ�y����
	 */
	public Piece(int indexX, int indexY) {
		this.indexX = indexX;
		this.indexY = indexY;
	}

	/**
	 * ��ȡ��Piece������λ��
	 * 
	 * @return ���ĵ���������Point
	 */
	public Point getCenter() {
		return new Point(getBeginX() + getPieceImage().getImage().getWidth()
				/ 2, getBeginY() + getPieceImage().getImage().getHeight() / 2);
	}

	/**
	 * �ж�����Piece�ϵ�ͼƬ�Ƿ���ͬ
	 * 
	 * @param otherPieceImage
	 *            �����һ��Piece����
	 * @return �Ƿ���ͬ
	 */
	public boolean isSameImage(Piece otherPieceImage) {
		if (pieceImage == null) {
			if (otherPieceImage.pieceImage != null)
				return false;
		}
		// ������Piece��װͼƬ��ԴID��ͬʱ��������Ϊ������Piece�ϵ�ͼƬ��ͬ��
		return pieceImage.getImageId() == otherPieceImage.pieceImage
				.getImageId();
	}

	/**
	 * @return �÷�������Ͻǵ�X����
	 */
	public int getBeginX() {
		return beginX;
	}

	/**
	 * ���ø÷�������Ͻǵ�X����
	 * 
	 * @param beginX
	 */
	public void setBeginX(int beginX) {
		this.beginX = beginX;
	}

	/**
	 * @return �÷�������Ͻǵ�Y����
	 */
	public int getBeginY() {
		return beginY;
	}

	/**
	 * ���ø÷�������Ͻǵ�Y����
	 * 
	 * @param beginY
	 */
	public void setBeginY(int beginY) {
		this.beginY = beginY;
	}

	/**
	 * @return �ö�����Piece[][]�����е�һά������ֵ
	 */
	public int getIndexX() {
		return indexX;
	}

	/**
	 * ���øö�����Piece[][]�����е�һά������ֵ
	 * 
	 * @param indexX
	 */
	public void setIndexX(int indexX) {
		this.indexX = indexX;
	}

	/**
	 * @return �ö�����Piece[][]�����еڶ�ά������ֵ
	 */
	public int getIndexY() {
		return indexY;
	}

	/**
	 * ���øö�����Piece[][]�����еڶ�ά������ֵ
	 * 
	 * @param indexY
	 */
	public void setIndexY(int indexY) {
		this.indexY = indexY;
	}

	/**
	 * @return ���淽����������Ӧ��ͼƬ
	 */
	public PieceImage getPieceImage() {
		return pieceImage;
	}

	/**
	 * ���ñ��淽����������Ӧ��ͼƬ
	 * 
	 * @param pieceImage
	 */
	public void setPieceImage(PieceImage pieceImage) {
		this.pieceImage = pieceImage;
	}
}
