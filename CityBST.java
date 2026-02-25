public class CityBST {
    TreeNode root;

    public void insert(String cityName) {
        root = insertRecursive(root, cityName);
    }

    private TreeNode insertRecursive(TreeNode root, String cityName) {
        if (root == null) {
            root = new TreeNode(cityName);
            return root;
        }
        if (cityName.compareToIgnoreCase(root.cityName) < 0) {
            root.left = insertRecursive(root.left, cityName);
        } else if (cityName.compareToIgnoreCase(root.cityName) > 0) {
            root.right = insertRecursive(root.right, cityName);
        }
        return root;
    }

    public void displayCities(TreeNode root) {
        if (root != null) {
            displayCities(root.left);
            System.out.println("- " + root.cityName);
            displayCities(root.right);
        }
    }
}