import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

class StudentGUI {
    int id;
    String name;
    String course;
    double marks;

    StudentGUI(int id, String name, String course, double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
}

public class Assignment2 extends Frame implements ActionListener {

    TextField idField, nameField, courseField, marksField;
    TextArea displayArea;
    ArrayList<StudentGUI> list = new ArrayList<>();

    public Assignment2() {
        setTitle("Student Management System");
        setSize(600, 500);
        setLayout(new BorderLayout());

        // Input fields
        Panel inputPanel = new Panel(new GridLayout(4, 2, 5, 5));
        inputPanel.add(new Label("ID:"));
        idField = new TextField();
        inputPanel.add(idField);
        inputPanel.add(new Label("Name:"));
        nameField = new TextField();
        inputPanel.add(nameField);
        inputPanel.add(new Label("Course:"));
        courseField = new TextField();
        inputPanel.add(courseField);
        inputPanel.add(new Label("Marks:"));
        marksField = new TextField();
        inputPanel.add(marksField);
        add(inputPanel, BorderLayout.NORTH);

        // Buttons
        Panel buttonPanel = new Panel(new FlowLayout());
        for (String name : new String[]{"Add", "Update", "Delete", "Clear"}) {
            Button btn = new Button(name);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }
        add(buttonPanel, BorderLayout.CENTER);

        // Display area
        displayArea = new TextArea();
        displayArea.setEditable(false);
        add(displayArea, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0); }
        });

        loadFromFile();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Add":
                addStudent();
                break;
            case "Update":
                updateStudent();
                break;
            case "Delete":
                deleteStudent();
                break;
            case "Clear":
                clearFields();
                break;
        }
    }

    void addStudent() {
        if (idField.getText().isEmpty() || nameField.getText().isEmpty() ||
                courseField.getText().isEmpty() || marksField.getText().isEmpty()) {
            showMessage("Please fill in all fields."); return;
        }

        int id = Integer.parseInt(idField.getText());
        for (StudentGUI s : list) {
            if (s.id == id){
                showMessage("ID already exists.");
                return; }
        }

        list.add(new StudentGUI(id, nameField.getText(), courseField.getText(),
                Double.parseDouble(marksField.getText())));
        saveToFile();
        clearFields();
        refreshDisplay();
        showMessage("Student added successfully!");
    }

    void updateStudent() {
        if (idField.getText().isEmpty()) { showMessage("Enter ID to update."); return; }
        int id = Integer.parseInt(idField.getText());
        for (StudentGUI s : list) {
            if (s.id == id) {
                if (!nameField.getText().isEmpty()) {
                    s.name   = nameField.getText();}
                if (!courseField.getText().isEmpty()){
                    s.course = courseField.getText();}
                if (!marksField.getText().isEmpty()) {
                    s.marks  = Double.parseDouble(marksField.getText()); }
                saveToFile();
                clearFields();
                refreshDisplay();
                showMessage("Student updated successfully!");
                return;
            }
        }
        showMessage("Student with ID " + id + " not found.");
    }

    void deleteStudent() {
        if (idField.getText().isEmpty()) { showMessage("Enter ID to delete.");
            return; }
        int id = Integer.parseInt(idField.getText());
        for (StudentGUI s : list) {
            if (s.id == id) {
                list.remove(s);
                saveToFile();
                clearFields();
                refreshDisplay();
                showMessage("Student deleted successfully!");
                return;
            }
        }
        showMessage("Student with ID " + id + " not found.");
    }

    void clearFields() {
        idField.setText(""); nameField.setText("");
        courseField.setText(""); marksField.setText("");
    }

    void refreshDisplay() {
        displayArea.setText("ID\tName\t\tCourse\t\tMarks\n");
        displayArea.append("--------------------------------------------\n");
        for (StudentGUI s : list)
            displayArea.append(s.id + "\t" + s.name + "\t\t" + s.course + "\t\t" + s.marks + "\n");
    }

    void showMessage(String msg) {
        Dialog d = new Dialog(this, "Message", true);
        d.setLayout(new FlowLayout());
        d.setSize(300, 100);
        d.add(new Label(msg));
        Button ok = new Button("OK");
        ok.addActionListener(ev -> d.dispose());
        d.add(ok);
        d.setVisible(true);
    }

    void saveToFile() {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("Storage.txt"));
            for (StudentGUI s : list) {
                w.write(s.id + "," + s.name + "," + s.course + "," + s.marks);
                w.newLine();
            }
            w.close();
        } catch (IOException e){
            showMessage("Error saving file.");
        }
    }

    void loadFromFile() {
        try {
            File file = new File("Storage.txt");
            if (!file.exists()) return;
            BufferedReader r = new BufferedReader(new FileReader(file));
            String line;
            while ((line = r.readLine()) != null) {
                String[] p = line.split(",");
                list.add(new StudentGUI(Integer.parseInt(p[0]), p[1], p[2], Double.parseDouble(p[3])));
            }
            r.close();
            refreshDisplay();
        } catch (IOException e){
            showMessage("Error loading file.");
        }
    }

    public static void main(String[] args){
        new Assignment2();
    }
}