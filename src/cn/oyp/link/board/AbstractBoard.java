package cn.oyp.link.board;

import java.util.List;

import cn.oyp.link.utils.GameConf;
import cn.oyp.link.utils.ImageUtil;
import cn.oyp.link.view.Piece;
import cn.oyp.link.view.PieceImage;

/**
 * ��Ϸ����ĳ����� <br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */

public abstract class AbstractBoard {
	// ����һ�����󷽷�, ������ȥʵ��
	/**
	 * ����һ��List���ϣ��ü��������ų�ʼ����Ϸʱ�����Piece����
	 */
	protected abstract List<Piece> createPieces(GameConf config,
			Piece[][] pieces);
	/**
	 * ����Piece����
	 * @param config
	 * @return
	 */
	public Piece[][] create(GameConf config) {
		// ����Piece[][]����
		Piece[][] pieces = new Piece[config.getXSize()][config.getYSize()];
		// ���طǿյ�Piece����, �ü���������ȥ����
		List<Piece> notNullPieces = createPieces(config, pieces);
		// ���ݷǿ�Piece����ļ��ϵĴ�С��ȡͼƬ
		List<PieceImage> playImages = ImageUtil.getPlayImages(
				config.getContext(), notNullPieces.size());
		// ����ͼƬ�Ŀ��߶�����ͬ��
		int imageWidth = playImages.get(0).getImage().getWidth();
		int imageHeight = playImages.get(0).getImage().getHeight();
		// �����ǿյ�Piece����
		for (int i = 0; i < notNullPieces.size(); i++) {
			// ���λ�ȡÿ��Piece����
			Piece piece = notNullPieces.get(i);
			piece.setPieceImage(playImages.get(i));
			// ����ÿ���������Ͻǵ�X��Y����
			piece.setBeginX(piece.getIndexX() * imageWidth
					+ config.getBeginImageX());
			piece.setBeginY(piece.getIndexY() * imageHeight
					+ config.getBeginImageY());
			// ���÷��������뷽���������Ӧλ�ô�
			pieces[piece.getIndexX()][piece.getIndexY()] = piece;
		}
		return pieces;
	}
}
