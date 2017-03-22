package thiagocury.eti.br.exentradadedadosedittextcomparseapi19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Widgets
    private EditText etCodigo;
    private EditText etNome;
    private EditText etCPF;
    private EditText etSalario;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referências
        etNome = (EditText) findViewById(R.id.et_codigo);
        etNome = (EditText) findViewById(R.id.et_nome);
        etNome = (EditText) findViewById(R.id.et_cpf);
        etNome = (EditText) findViewById(R.id.et_salario);
        btnOK = (Button) findViewById(R.id.btn_ok);

        //Evento onClick do botão OK para receber os dados do cliente.
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Instanciando objeto cli do tipo Cliente.
                Cliente cli = new Cliente();

                /* Recebendo o codigo como String convertendo
                   para int através do método Integer.parseInt() */
                cli.setCodigo(Integer.parseInt(etCodigo.getText().toString()));

                //Recebendo o nome como String. Não é necessário conversão!
                cli.setNome(etNome.getText().toString());

                /* Recebendo o CPF como String convertendo
                   para long através do método Long.parseLong() */
                cli.setCPF(Long.parseLong(etCPF.getText().toString()));

                /* Recebendo o Salário como String convertendo
                   para double através do método Double.parseDouble() */
                cli.setSalario(Double.parseDouble(etSalario.getText().toString()));

                //Enviando retorno para o usuário do App.
                Toast.makeText(
                        getBaseContext(),
                        "Cliente cadastrado!\n"+cli.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
