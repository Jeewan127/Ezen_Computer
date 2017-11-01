package Interface;

public class Button {
	ClickLisner clickLisner = null;
	
	public void click() {
		if (clickLisner != null) {
			clickLisner.onClick();
		}
	}

	public ClickLisner getClickLisner() {
		return clickLisner;
	}

	public void setClickLisner(ClickLisner clickLisner) {
		this.clickLisner = clickLisner;
	}
}
