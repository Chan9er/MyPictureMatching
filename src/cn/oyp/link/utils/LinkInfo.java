package cn.oyp.link.utils;

import java.util.List;
import java.util.ArrayList;

import android.graphics.Point;

/**
 * ������Ϣ��<br/>
 * <br/>
 * ���ڱ�������ܿ��Բο�һ�²���: <a href="http://blog.csdn.net/ouyang_peng">ŷ������CSDN����</a> <br/>
 */
public class LinkInfo {
	/**
	 *  ����һ���������ڱ������ӵ�
	 */
	private List<Point> points = new ArrayList<Point>();

	/**
	 *  �ṩ��һ��������, ��ʾ����Point����ֱ������, û��ת�۵�
	 * @param p1
	 * @param p2
	 */
	public LinkInfo(Point p1, Point p2) {
		// �ӵ�������ȥ
		points.add(p1);
		points.add(p2);
	}

	/**
	 *  �ṩ�ڶ���������, ��ʾ����Point��������, p2��p1��p3֮���ת�۵�
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	public LinkInfo(Point p1, Point p2, Point p3) {
		points.add(p1);
		points.add(p2);
		points.add(p3);
	}

	/**
	 *  �ṩ������������, ��ʾ�ĸ�Point��������, p2, p3��p1��p4��ת�۵�
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public LinkInfo(Point p1, Point p2, Point p3, Point p4) {
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
	}

	/**
	 * @return ���Ӽ���
	 */
	public List<Point> getLinkPoints() {
		return points;
	}
}
