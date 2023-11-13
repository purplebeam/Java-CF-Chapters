package gr.aueb.codingfactory.other.smproject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolManagement extends JFrame {

    private List<Subject> subjects = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();

    private JComboBox<Student> studentComboBox;
    private JComboBox<Subject> subjectComboBox;
    private JTextField scoreTextField;
    private JTextArea gradesTextArea;

    public SchoolManagement() {
        setTitle("School Management System");
        setSize(1080, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Subject entry
        JTextField subjectTextField = new JTextField();
        JButton addSubjectButton = new JButton("Add Subject");
        addSubjectButton.addActionListener(e -> addSubject(subjectTextField.getText()));
        addComponent(inputPanel, "Subject Title:", subjectTextField, addSubjectButton);

        // Student entry
        JTextField firstNameTextField = new JTextField();
        JTextField lastNameTextField = new JTextField();
        JTextField birthDateTextField = new JTextField();
        JTextField genderTextField = new JTextField();
        JTextField addressTextField = new JTextField();
        JButton addStudentButton = new JButton("Add Student");
        addStudentButton.addActionListener(e -> addStudent(
                firstNameTextField.getText(),
                lastNameTextField.getText(),
                birthDateTextField.getText(),
                genderTextField.getText(),
                addressTextField.getText()
        ));
        addComponent(inputPanel, "First Name:", firstNameTextField);
        addComponent(inputPanel, "Last Name:", lastNameTextField);
        addComponent(inputPanel, "Birth Date:", birthDateTextField);
        addComponent(inputPanel, "Gender:", genderTextField);
        addComponent(inputPanel, "Address:", addressTextField);
        addComponent(inputPanel, "", addStudentButton);

        // Grade entry
        studentComboBox = new JComboBox<>();
        subjectComboBox = new JComboBox<>();
        scoreTextField = new JTextField();
        JButton addGradeButton = new JButton("Add Grade");
        addGradeButton.addActionListener(e -> addGrade(
                (Student) studentComboBox.getSelectedItem(),
                (Subject) subjectComboBox.getSelectedItem(),
                Integer.parseInt(scoreTextField.getText())
        ));
        addComponent(inputPanel, "Student:", studentComboBox);
        addComponent(inputPanel, "Subject:", subjectComboBox);
        addComponent(inputPanel, "Score:", scoreTextField, addGradeButton);

        panel.add(inputPanel);

        gradesTextArea = new JTextArea();
        gradesTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(gradesTextArea);
        panel.add(scrollPane);

        add(panel);
    }

    private void addComponent(JPanel panel, String label, JComponent... components) {
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));

        for (JComponent component : components) {
            subPanel.add(component);
        }

        if (!label.isEmpty()) {
            subPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add some spacing between components
            JLabel jLabel = new JLabel(label);
            subPanel.add(jLabel);
        }

        panel.add(subPanel);
    }

    private void addSubject(String title) {
        if (!title.isEmpty()) {
            subjects.add(new Subject(title));
            updateComboBoxes();
            JOptionPane.showMessageDialog(this, "Subject added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a subject title.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addStudent(String firstName, String lastName, String birthDate, String gender, String address) {
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            students.add(new Student(firstName, lastName, birthDate, gender, address));
            updateComboBoxes();
            JOptionPane.showMessageDialog(this, "Student added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both first and last names.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addGrade(Student student, Subject subject, int score) {
        if (student != null && subject != null) {
            grades.add(new Grade(student, subject, score));
            updateGradesTextArea();
            JOptionPane.showMessageDialog(this, "Grade added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a student and a subject.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateComboBoxes() {
        studentComboBox.setModel(new DefaultComboBoxModel<>(students.toArray(new Student[0])));
        subjectComboBox.setModel(new DefaultComboBoxModel<>(subjects.toArray(new Subject[0])));
    }

    private void updateGradesTextArea() {
        gradesTextArea.setText("");
        for (Grade grade : grades) {
            gradesTextArea.append(grade.student.firstName + " " + grade.student.lastName +
                    " - " + grade.subject.title + ": " + grade.score + "\n");
        }
    }

    private static class Subject {
        String title;

        public Subject(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    private static class Student {
        String firstName;
        String lastName;
        String birthDate;
        String gender;
        String address;

        public Student(String firstName, String lastName, String birthDate, String gender, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.gender = gender;
            this.address = address;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    private static class Grade {
        Student student;
        Subject subject;
        int score;

        public Grade(Student student, Subject subject, int score) {
            this.student = student;
            this.subject = subject;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SchoolManagement().setVisible(true);
        });
    }
}
