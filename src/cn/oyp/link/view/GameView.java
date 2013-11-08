package cn.oyp.link.view;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import cn.oyp.link.board.GameService;
import cn.oyp.link.utils.ImageUtil;
import cn.oyp.link.utils.LinkInfo;

/**
 * ��������Ϸ�е���Ϸ������ <br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */
public class GameView extends View {
	/**
	 * ��Ϸ�߼���ʵ����
	 */
	private GameService gameService;
	/**
	 * ���浱ǰ�Ѿ���ѡ�еķ���
	 */
	private Piece selectedPiece;
	/**
	 * ������Ϣ����
	 */
	private LinkInfo linkInfo;
	/**
	 * ����Paint
	 */
	private Paint paint;
	/**
	 * ѡ�б�ʶ��ͼƬ����
	 */
	private Bitmap selectImage;

	/**
	 * ���췽��
	 * 
	 * @param context
	 * @param attrs
	 */
	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.paint = new Paint();
		// ���������ߵ���ɫ
		this.paint.setColor(Color.RED);
		// ���������ߵĴ�ϸ
		this.paint.setStrokeWidth(3);
		// ��ʼ����ѡ�е�ͼƬ
		this.selectImage = ImageUtil.getSelectImage(context);
	}

	/**
	 * ����������Ϣ����
	 * 
	 * @param linkInfo
	 */
	public void setLinkInfo(LinkInfo linkInfo) {
		this.linkInfo = linkInfo;
	}

	/**
	 * ���õ�ǰѡ�з���
	 * 
	 * @param piece
	 */
	public void setSelectedPiece(Piece piece) {
		this.selectedPiece = piece;
	}

	/**
	 * ������Ϸ�߼���ʵ����
	 * 
	 * @param gameService
	 */
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

	/**
	 * ����ͼ�εķ���
	 */
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		if (this.gameService == null)
			return;
		Piece[][] pieces = gameService.getPieces();
		if (pieces != null) {
			// ����pieces��ά����
			for (int i = 0; i < pieces.length; i++) {
				for (int j = 0; j < pieces[i].length; j++) {
					// �����ά�����и�Ԫ�ز�Ϊ�գ����з��飩������������ͼƬ������
					if (pieces[i][j] != null) {
						// �õ����Piece����
						Piece piece = pieces[i][j];
						// ���ݷ������Ͻ�X��Y������Ʒ���
						canvas.drawBitmap(piece.getPieceImage().getImage(),
								piece.getBeginX(), piece.getBeginY(), null);
					}
				}
			}
		}
		// �����ǰ��������linkInfo����, ��������Ϣ
		if (this.linkInfo != null) {
			// ����������
			drawLine(this.linkInfo, canvas);
			// ����������linkInfo����
			this.linkInfo = null;
		}
		// ��ѡ�б�ʶ��ͼƬ
		if (this.selectedPiece != null) {
			canvas.drawBitmap(this.selectImage, this.selectedPiece.getBeginX(),
					this.selectedPiece.getBeginY(), null);
		}
	}

	/**
	 * ����LinkInfo���������ߵķ�����
	 * 
	 * @param linkInfo
	 *            ������Ϣ����
	 * @param canvas
	 *            ����
	 */
	private void drawLine(LinkInfo linkInfo, Canvas canvas) {
		// ��ȡLinkInfo�з�װ���������ӵ�
		List<Point> points = linkInfo.getLinkPoints();
		// ���α���linkInfo�е�ÿ�����ӵ�
		for (int i = 0; i < points.size() - 1; i++) {
			// ��ȡ��ǰ���ӵ�����һ�����ӵ�
			Point currentPoint = points.get(i);
			Point nextPoint = points.get(i + 1);
			// ��������
			canvas.drawLine(currentPoint.x, currentPoint.y, nextPoint.x,
					nextPoint.y, this.paint);
		}
	}

	// ��ʼ��Ϸ����
	public void startGame() {
		this.gameService.start();
		this.postInvalidate();
	}
}
