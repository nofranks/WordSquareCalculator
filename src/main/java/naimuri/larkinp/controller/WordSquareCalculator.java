package naimuri.larkinp.controller;

import naimuri.larkinp.model.SearchTreeNode;
import naimuri.larkinp.util.UnreadableDictionaryException;

public interface WordSquareCalculator {

	public String[] generateCube(int wordLength, String availableCharacters) throws UnreadableDictionaryException;
//	public int getWordLength();
//	public String getAvailableCharacters();
//	public SearchTreeNode getTreeRoot();
}
