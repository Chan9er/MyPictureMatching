package cn.oyp.link.utils;

import android.content.Context;

/**
 * ������Ϸ���õĶ��� <br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */
public class GameConf {
	/**
	 * ��������ÿ�������ͼƬ�Ŀ�
	 */
	public static final int PIECE_WIDTH = 40;
	/**
	 * ��������ÿ�������ͼƬ�ĸ�s
	 */
	public static final int PIECE_HEIGHT = 40;
	/**
	 * ��¼��Ϸ�����¼���100�룩.
	 */
	public static int DEFAULT_TIME = 100;
	/**
	 * Piece[][]�����һά�ĳ���
	 */
	private int xSize;
	/**
	 * Piece[][]����ڶ�ά�ĳ���
	 */
	private int ySize;
	/**
	 * Board�е�һ��ͼƬ���ֵ�x����
	 */
	private int beginImageX;
	/**
	 * Board�е�һ��ͼƬ���ֵ�y����
	 */
	private int beginImageY;
	/**
	 * ��¼��Ϸ����ʱ��, ��λ����
	 */
	private long gameTime;
	/**
	 * Ӧ��������
	 */
	private Context context;

	/**
	 * �ṩһ������������
	 * 
	 * @param xSize
	 *            Piece[][]�����һά����
	 * @param ySize
	 *            Piece[][]����ڶ�ά����
	 * @param beginImageX
	 *            Board�е�һ��ͼƬ���ֵ�x����
	 * @param beginImageY
	 *            Board�е�һ��ͼƬ���ֵ�y����
	 * @param gameTime
	 *            ����ÿ�ֵ�ʱ��, ��λ�Ǻ���
	 * @param context
	 *            Ӧ��������
	 */
	public GameConf(int xSize, int ySize, int beginImageX, int beginImageY,
			long gameTime, Context context) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.beginImageX = beginImageX;
		this.beginImageY = beginImageY;
		this.gameTime = gameTime;
		this.context = context;
	}

	/**
	 * @return ��Ϸ����ʱ��
	 */
	public long getGameTime() {
		return gameTime;
	}

	/**
	 * @return Piece[][]�����һά�ĳ���
	 */
	public int getXSize() {
		return xSize;
	}

	/**
	 * @return Piece[][]����ڶ�ά�ĳ���
	 */
	public int getYSize() {
		return ySize;
	}

	/**
	 * @return Board�е�һ��ͼƬ���ֵ�x����
	 */
	public int getBeginImageX() {
		return beginImageX;
	}

	/**
	 * @return Board�е�һ��ͼƬ���ֵ�y����
	 */
	public int getBeginImageY() {
		return beginImageY;
	}

	/**
	 * @return Ӧ��������
	 */
	public Context getContext() {
		return context;
	}
}
