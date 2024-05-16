package copy_cat.ver1.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import copy_cat.ver1.utils.Define;

public class Player extends JLabel {
	private Player player;
	private int way;
	private int player_Hight = 100;
	private int player_Width = 70;
	
	
	private ImageIcon front;
	private ImageIcon down_RightStep;
	private ImageIcon down_LeftStep;
	
	private boolean isOpenEye = true;
	private boolean isStay ;
	
	public Player() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		front = new ImageIcon(Define.PLAYER_STAY_IMAGE);
		down_RightStep = new ImageIcon(Define.DOWN_RIGHT_STEP_IMAGE);
		down_LeftStep = new ImageIcon(Define.DOWN_LEFT_STEP_IMAGE);
		
	}
	
	private void setInitLayout() {
		setIcon(front);
		setSize(player_Width,player_Hight);
	}
	
}
