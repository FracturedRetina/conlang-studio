package com.eshimoniak.conlangstudio.ui.buttons;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.eshimoniak.conlangstudio.ui.panels.editor.EditorWrapper;
import com.eshimoniak.conlangstudio.ui.panels.editor.RawEditor;

public class ButtonPair extends JPanel {
	public ButtonPair(EditorWrapper editor, String[] buttonTexts) {
		setLayout(new GridLayout(1, buttonTexts.length));
		for (int i = 0; i < buttonTexts.length; i++) {
			if (buttonTexts[i] == null) {
				JButton none = new JButton("a");
				none.setVisible(false);
				add(none);
			} else {
				add(new KeyboardButton(editor, buttonTexts[i]));
			}
		}
	}
	public ButtonPair(EditorWrapper editor, String buttonText1, String buttonText2) {
		this(editor, new String[] {buttonText1, buttonText2});
	}
}
