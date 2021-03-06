import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Node {

	/**
	 * The Strings to output when this node is visited
	 */
	private Set<String> out;

	/**
	 * Which Node to move to based on the next Character encountered
	 */
	private Map<Character, Node> children;

	/**
	 * The Node to move to when the next Character fails
	 */
	private Node fail;

	
	/**
	 * Default Constructor, initializes out and children (not fail)
	 */
	public Node() {
		out = new HashSet<String>();
		children = new HashMap<Character, Node>();
	}

	/*
	 * Hint: All of the following methods are simply to provide functionality to your node class and
	 * can be done in a single line - of course you may use more than one line if you wish, I would
	 * recommend reading the Map API if any of these methods are becoming complicated
	 */

	/**
	 * @param c , a character
	 * @return true if this node has a child by following the edge c, false otherwise
	 */
	public boolean hasChild(char c) {
		return children.containsKey(c);
	}

	/**
	 * @param c , a character
	 * @return get the child of this node by following the edge c
	 */
	public Node getChild(char c) {
		return children.get(c);
	}

	/**
	 * @return a collection of all children that this node has
	 */
	public Collection<Node> getAllChildren() {
		return children.values();
	}

	/**
	 * @return a collection of all keys (edges) out of this node
	 */
	public Collection<Character> getAllKeys() {
		return children.keySet();
	}

	/**
	 * @param c , adds a new node to the children of this node by edge c
	 */
	public void addChild(char c) {
		children.put(c,new Node());

	}

	/**
	 * @return the node to go to on a failure
	 */
	public Node getFail() {
		return fail;
	}

	/**
	 * @return the set of Strings that should be output when this node is visited
	 */
	public Set<String> getOut() {
		return out;
	}

	/**
	 * @param s , a String to add to the output of this node
	 */
	public void addOut(String s) {
		out.add(s);
	}

	/**
	 * @param fail , where this node should go to on a failure
	 */
	public void setFail(Node fail) {
		this.fail = fail;

	}
}
