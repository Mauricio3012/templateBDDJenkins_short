package suporte;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.qameta.allure.Attachment;

public class Utils {

	public static String fileTestResult;
	public static String data;
	public static String hora;

	public static void geraHorarioExecucao() {
		Date dataHoraAtual = new Date();
		data = new SimpleDateFormat("ddMMyyyy").format(dataHoraAtual);
		hora = new SimpleDateFormat("HHmmss").format(dataHoraAtual);
		System.out.println("A data é " + data + " e o horário é " + hora);

	}

}
