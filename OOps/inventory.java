import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class InventoryItem {
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class InventoryManager {
    private List<InventoryItem> inventory;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        inventory.add(item);
    }

    public void removeItem(String itemName) {
        inventory.removeIf(item -> item.getName().equals(itemName));
    }

    public List<InventoryItem> getInventory() {
        return new ArrayList<>(inventory);
    }
}

class InventoryGUI {
    private JFrame frame;
    private InventoryManager inventoryManager;

    public InventoryGUI() {
        this.inventoryManager = new InventoryManager();
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Inventory Management System");
        frame.setBounds(100, 100, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 1, 0, 10));

        JButton btnAddItem = new JButton("Add Item");
        btnAddItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAddItemDialog();
            }
        });
        panel.add(btnAddItem);

        JButton btnRemoveItem = new JButton("Remove Item");
        btnRemoveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showRemoveItemDialog();
            }
        });
        panel.add(btnRemoveItem);

        JButton btnViewInventory = new JButton("View Inventory");
        btnViewInventory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayInventory();
            }
        });
        panel.add(btnViewInventory);

        frame.setVisible(true);
    }

    private void showAddItemDialog() {
        JTextField itemNameField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField priceField = new JTextField();

        Object[] fields = {"Item Name:", itemNameField, "Quantity:", quantityField, "Price:", priceField};

        int result = JOptionPane.showConfirmDialog(frame, fields, "Add Item", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String itemName = itemNameField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                double price = Double.parseDouble(priceField.getText());

                InventoryItem newItem = new InventoryItem(itemName, quantity, price);
                inventoryManager.addItem(newItem);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values for Quantity and Price.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showRemoveItemDialog() {
        JTextField itemNameField = new JTextField();
        Object[] fields = {"Item Name:", itemNameField};

        int result = JOptionPane.showConfirmDialog(frame, fields, "Remove Item", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String itemName = itemNameField.getText();
            inventoryManager.removeItem(itemName);
        }
    }

    private void displayInventory() {
        List<InventoryItem> inventory = inventoryManager.getInventory();
        StringBuilder inventoryText = new StringBuilder("Inventory:\n");

        for (InventoryItem item : inventory) {
            inventoryText.append(item.getName()).append(" - Quantity: ").append(item.getQuantity())
                    .append(", Price: $").append(item.getPrice()).append("\n");
        }

        JOptionPane.showMessageDialog(frame, inventoryText.toString(), "Inventory", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InventoryGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
