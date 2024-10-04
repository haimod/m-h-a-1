import java.awt.*;//Thư viện này cung cấp các lớp để tạo giao diện đồ họa cơ bản, như cửa sổ, nút bấm, hộp văn bản...
import java.awt.event.*;//Thư viện này chứa các lớp để xử lý các sự kiện xảy ra trên giao diện, ví dụ như khi người dùng nhấn nút.
import javax.swing.*;//Thư viện này cung cấp các thành phần giao diện đồ họa nâng cao hơn, như các hộp thoại, thanh cuộn, và các thành phần phức tạp khác.

public class CaesarCipher extends JFrame implements ActionListener {//Kế thừa JFrame:r sẽ tạo ra một cửa sổ (frame) trên màn hình.ActionListener: xử lý các sự kiện
    private JTextArea inputText, outputText;//Hai hộp văn bản để người dùng nhập văn bản gốc và xem kết quả sau khi mã hóa/giải mã.
    private JSpinner keySpinnerEncrypt, keySpinnerDecrypt;//Hai thành phần cho phép người dùng nhập khóa (số lượng vị trí dịch chuyển) để mã hóa và giải mã.
    private JButton encryptButton, decryptButton;//Hai nút bấm để thực hiện các thao tác mã hóa và giải mã.
    public CaesarCipher() {
        setTitle("Caesar Cipher Demo");//Đặt tiêu đề cho cửa sổ thành "Caesar Cipher Demo".
        setSize(500, 250);//Thiết lập kích thước của cửa sổ thành 500 pixel chiều rộng và 250 pixel chiều cao.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Xác định hành động khi người dùng đóng cửa sổ 
        setLayout(new GridBagLayout());// Sử dụng layout GridBagLayout để sắp xếp các thành phần trên cửa sổ một cách linh hoạt.
        GridBagConstraints gbc = new GridBagConstraints();//Tạo một đối tượng GridBagConstraints để điều chỉnh cách các thành phần được đặt trong layout

        inputText = new JTextArea(5, 20);//Tạo một hộp văn bản có 5 hàng và 20 cột để nhập văn bản gốc.
        outputText = new JTextArea(5, 20);// Tạo một hộp văn bản có 5 hàng và 20 cột để hiển thị kết quả mã hóa/giải mã.
        keySpinnerEncrypt = new JSpinner(new SpinnerNumberModel(0, 0, 25, 1));//Tạo một thanh trượt số cho khóa mã hóa, với giá trị mặc định là 0, giá trị tối thiểu là 0, giá trị tối đa là 25, và bước nhảy là 1.
        keySpinnerDecrypt = new JSpinner(new SpinnerNumberModel(0, 0, 25, 1));//
        encryptButton = new JButton("Encryption");//Tạo một nút bấm có nhãn "Encryption".
        decryptButton = new JButton("Decryption");//Tạo một nút bấm có nhãn "Decryption".

        // vùng nhập văn bản
        gbc.gridx = 0; // Xác định vị trí hàng và cột của thành phần trong lưới. 
        gbc.gridy = 0;//Ở đây, thành phần sẽ được đặt ở ô đầu tiên (hàng 0, cột 0).
        gbc.gridheight = 1;// xác định chiều cao
        gbc.gridwidth = 2;// xác định chiều rộng
        gbc.fill = GridBagConstraints.BOTH; // thành phần điền vào ô lưới
        gbc.weightx = 1; // xác định trọng số khi bố cục dư
        gbc.weighty = 1;
        gbc.insets = new Insets(0, 0, 5, 0);
        add(new JScrollPane(inputText), gbc);// tạo 1 thanh cuộn

        // kết quả đầu ra
        gbc.gridx = 0;//Đặt vị trí của thành phần theo chiều ngang tại cột 0 của lưới
        gbc.gridy = 1;//Đặt vị trí của thành phần theo chiều dọc tại hàng 1 của lưới.
        gbc.gridheight = 1;//Thiết lập chiều cao của thành phần chiếm 1 hàng của lưới.
        gbc.gridwidth = 2;// Thiết lập chiều rộng của thành phần chiếm 2 cột của lưới.
        gbc.fill = GridBagConstraints.BOTH;//Khi thành phần được thay đổi kích thước, nó sẽ cố gắng lấp đầy cả chiều rộng và chiều cao của ô chứa nó.
        gbc.weightx = 1;//Thiết lập trọng số theo chiều ngang cho thành phần
        gbc.weighty = 1;//Thiết lập trọng số theo chiều dọc cho thành phần
        add(new JScrollPane(outputText), gbc);//

        // Encryption key label
        gbc.gridx = 2;// Đặt vị trí của thành phần theo chiều ngang tại cột 2 của lưới.
        gbc.gridy = 0;//Đặt vị trí của thành phần theo chiều dọc tại hàng 0 của lưới.
        gbc.gridheight = 1;//Thiết lập chiều cao của thành phần chiếm 1 hàng của lưới.
        gbc.gridwidth = 1;//Thiết lập chiều rộng của thành phần chiếm 1 cột của lưới.
        gbc.fill = GridBagConstraints.NONE;//Thành phần sẽ không cố gắng lấp đầy ô chứa nó, mà giữ nguyên kích thước tự nhiên.
        gbc.weightx = 0;//Thiết lập trọng số theo chiều ngang cho thành phần là 0
        gbc.weighty = 0;//Thiết lập trọng số theo chiều dọc cho thành phần là 0
        gbc.insets = new Insets(0, 10, 55, 0);///Thiết lập khoảng cách viền xung quanh thành phần
        add(new JLabel("Key"), gbc);//Thêm một nhãn văn bản có nội dung "Key" 

        // Spinner for encryption key
        gbc.gridx = 3;//Đặt vị trí của thành phần theo chiều ngang tại cột 3 của lưới
        gbc.gridy = 0;// Đặt vị trí của thành phần theo chiều dọc tại hàng 0 của lưới.
        gbc.insets = new Insets(0, 0, 50, 70);//hiết lập khoảng cách viền xung quanh thành phần:
        add(keySpinnerEncrypt, gbc);// Thêm thanh trượt khóa mã hóa vào cửa sổ
        

        // Encryption button
        gbc.gridx = 3;//Đặt vị trí của thành phần theo chiều ngang tại cột 3 của lưới
        gbc.gridy = 0;//Đặt vị trí của thành phần theo chiều dọc tại hàng 0 của lưới
        gbc.insets = new Insets(50, 0, 0, 20); // Thiết lập khoảng cách viền xung quanh thành phần
        gbc.anchor = GridBagConstraints.NORTH;//Đặt nút bấm vào vị trí phía trên của ô chứa nó.
        add(encryptButton, gbc);//Thêm nút mã hóa vào cửa sổ

        // Decryption key label
        gbc.gridx = 2;//Đặt vị trí của thành phần theo chiều ngang tại cột 2 của lưới.
        gbc.gridy = 1;//Đặt vị trí của thành phần theo chiều dọc tại hàng 1 của lưới.
        gbc.gridheight = 1;//Thiết lập chiều cao của thành phần chiếm 1 hàng của lưới.
        gbc.gridwidth = 1;//Thiết lập chiều rộng của thành phần chiếm 1 cột của lưới.
        gbc.fill = GridBagConstraints.NONE;//Thành phần sẽ không cố gắng lấp đầy ô chứa nó, mà giữ nguyên kích thước tự nhiên.
        gbc.weightx = 0;//Thiết lập trọng số theo chiều ngang cho thành phần là 0,
        gbc.weighty = 0;//Thiết lập trọng số theo chiều dọc cho thành phần là 0
        gbc.insets = new Insets(0, 10, 55, 0);//Thiết lập khoảng cách viền xung quanh thành phần:
        add(new JLabel("Key"), gbc);//Thêm một nhãn văn bản có nội dung "Key" vào cửa sổ

        // Spinner for decryption key
        gbc.gridx = 3;// Đặt vị trí của thành phần theo chiều ngang tại cột 3 của lưới
        gbc.gridy = 1;// Đặt vị trí của thành phần theo chiều dọc tại hàng 1 của lưới
        gbc.insets = new Insets(0, 0, 15, 70);//Thiết lập khoảng cách viền xung quanh thành phần:
        add(keySpinnerDecrypt, gbc);//Thêm thanh trượt khóa giải mã vào cửa sổ

        // Decryption button
        gbc.gridx = 3;//Đặt vị trí của thành phần theo chiều ngang tại cột 3 của lưới
        gbc.gridy = 1;//Đặt vị trí của thành phần theo chiều dọc tại hàng 1 của lưới
        gbc.insets = new Insets(30, 0, 0, 20);//Thiết lập khoảng cách viền xung quanh thành phần:
        gbc.anchor = GridBagConstraints.NORTH;//Đặt nút bấm vào vị trí phía trên của ô chứa nó.
        add(decryptButton, gbc);// Thêm nút giải mã vào cửa sổ

        // Set action listeners
        encryptButton.addActionListener(this);//Thêm sự kiện xử lý cho nút mã hóa
        decryptButton.addActionListener(this);//Thêm sự kiện xử lý cho nút giải mã 

        // Make the output text area non-editable
        outputText.setEditable(false);//Thiết lập thuộc tính editable của hộp văn bản đầu ra thành false, ngăn chặn người dùng chỉnh sửa nội dung của nó.
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == encryptButton) {//Kiểm tra xem sự kiện được kích hoạt là từ nút mã hóa.
            String input = inputText.getText();//Lấy nội dung từ hộp văn bản đầu vào
            int key = (int) keySpinnerEncrypt.getValue();// Lấy giá trị của thanh trượt khóa mã hóa.
            String output = encrypt(input, key);//Gọi phương thức encrypt để mã hóa văn bản với khóa đã cho.
            outputText.setText(output);//Đặt kết quả mã hóa vào hộp văn bản đầu ra.
        } else if (e.getSource() == decryptButton) {//Kiểm tra xem sự kiện được kích hoạt là từ nút giải mã.
            String input = inputText.getText();//Lấy nội dung từ hộp văn bản đầu vào.
            int key = (int) keySpinnerDecrypt.getValue();//Lấy giá trị của thanh trượt khóa giải mã.
            String output = decrypt(input, key);// Gọi phương thức decrypt để giải mã văn bản với khóa đã cho.
            outputText.setText(output);//Đặt kết quả giải mã vào hộp văn bản đầu ra
        }
    }

    public String encrypt(String text, int key) {//
        StringBuilder sb = new StringBuilder();//Tạo một đối tượng StringBuilder để xây dựng chuỗi kết quả.
        for (char ch : text.toCharArray()) {// Duyệt qua từng ký tự trong chuỗi đầu vào.
            if (Character.isLetter(ch)) {//Kiểm tra xem ký tự hiện tại là chữ cái hay không.
                char base = Character.isUpperCase(ch) ? 'A' : 'a';//Xác định ký tự cơ bản (A cho chữ hoa, a cho chữ thường) dựa trên chữ cái hiện tại.
                ch = (char) (((ch - base + key) % 26 + 26) % 26 + base); //Thực hiện phép tính mã hóa:
            }
            sb.append(ch);// Thêm ký tự mã hóa vào chuỗi kết quả.
        }
        return sb.toString();// Trả về chuỗi kết quả sau khi mã hóa.
    }

    public String decrypt(String text, int key) {
        return encrypt(text, 26 - (key % 26)); //Gọi phương thức encrypt với khóa đảo ngược (26 - (key % 26)) để thực hiện giải mã.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {// Sử dụng phương thức invokeLater của SwingUtilities để đảm bảo rằng việc tạo và hiển thị cửa sổ được thực hiện trên luồng giao diện người dùng (UI thread) của Swing.
            CaesarCipher cipher = new CaesarCipher();//Tạo một đối tượng CaesarCipher để khởi tạo ứng dụng.
            cipher.setVisible(true);// Hiển thị cửa sổ của ứng dụng trên màn hình.
        });
    }

    public JTextArea getInputText() {
        return inputText;
    }

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }

    public JTextArea getOutputText() {
        return outputText;
    }

    public void setOutputText(JTextArea outputText) {
        this.outputText = outputText;
    }

    public JSpinner getKeySpinnerEncrypt() {
        return keySpinnerEncrypt;
    }

    public void setKeySpinnerEncrypt(JSpinner keySpinnerEncrypt) {
        this.keySpinnerEncrypt = keySpinnerEncrypt;
    }

    public JSpinner getKeySpinnerDecrypt() {
        return keySpinnerDecrypt;
    }

    public void setKeySpinnerDecrypt(JSpinner keySpinnerDecrypt) {
        this.keySpinnerDecrypt = keySpinnerDecrypt;
    }

    public JButton getEncryptButton() {
        return encryptButton;
    }

    public void setEncryptButton(JButton encryptButton) {
        this.encryptButton = encryptButton;
    }

    public JButton getDecryptButton() {
        return decryptButton;
    }

    public void setDecryptButton(JButton decryptButton) {
        this.decryptButton = decryptButton;
    }
}
