package data_structures_test.tree;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeNode<T> {
	 
	 private T parameters = null;	// data object T
//	 private TreeNode<T> parent = null;
//	 private List<TreeNode<T>> children = new ArrayList<>();
	 private Map<String, TreeNode<T>> submodules = new HashMap<>();
	 
	 public TreeNode(T parameters) {
		 this.parameters = parameters;
	 }
	 
//	 public TreeNode<T> addChild(TreeNode<T> child) {
////		 child.setParent(this);
//		 this.children.add(child);
//		 return child;
//	 }
	 
	 public void addChildToMap(String key, TreeNode<T> value) {
		 this.submodules.put(key, value);
	 }
	 
	 public void addChildrenToMap(Map<String, TreeNode<T>> submodules) {
		 this.submodules.putAll(submodules);
	 }
	 
//	 public void addChildren(List<TreeNode<T>> children) {
////		 children.forEach(each -> each.setParent(this));
//		 this.children.addAll(children);
//	 }
	 
//	 public List<TreeNode<T>> getChildren() {
//		 return children;
//	 }
	 
	 public Map<String, TreeNode<T>> getSubmodules() {
		 return submodules;
	 }
	 
	 public T getParameters() {
		 return parameters;
	 }
	 
	 public void setParameters(T parameters) {
		 this.parameters = parameters;
	 }
	 
//	 private void setParent(TreeNode<T> parent) {
//		 this.parent = parent;
//	 }
//	 
//	 public TreeNode<T> getParent() {
//		 return parent;
//	 }
}