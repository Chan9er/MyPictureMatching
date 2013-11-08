package cn.oyp.link.board;

import cn.oyp.link.utils.LinkInfo;
import cn.oyp.link.view.Piece;

/**
 * ��Ϸ�߼��ӿ� <br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */
public interface GameService {
	/**
	 * ������Ϸ��ʼ�ķ���
	 */
	public void start();

	/**
	 * ����һ���ӿڷ���, ���ڷ���һ����ά����
	 * 
	 * @return ��ŷ������Ķ�ά����
	 */
	public Piece[][] getPieces();

	/**
	 * �жϲ���Piece[][]�������Ƿ񻹴��ڷǿյ�Piece����
	 * 
	 * @return �����ʣPiece���󷵻�true, û�з���false
	 */
	public boolean hasPieces();

	/**
	 * ��������x�����y����, ���ҳ�һ��Piece����
	 * 
	 * @param touchX
	 *            �������x����
	 * @param touchY
	 *            �������y����
	 * @return ���ض�Ӧ��Piece����, û�з���null
	 */
	public Piece findPiece(float touchX, float touchY);

	/**
	 * �ж�����Piece�Ƿ��������, ��������, ����LinkInfo����
	 * 
	 * @param p1
	 *            ��һ��Piece����
	 * @param p2
	 *            �ڶ���Piece����
	 * @return �����������������LinkInfo����, �������Piece����������, ����null
	 */
	public LinkInfo link(Piece p1, Piece p2);
}
