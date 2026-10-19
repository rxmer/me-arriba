package com.reserva.sensor_queda.alerta;

import android.os.Handler;
import android.os.Looper;

public class EnviadorAlertaSimulado implements EnviadorAlerta {

    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override
    public void enviar(String payload, Callback callback) {
        handler.postDelayed(() -> {
            ResultadoAlerta resultado = new ResultadoAlerta();
            resultado.demo = true;
            resultado.apiSucesso = true;
            resultado.mensagemApi = "Envio simulado (modo demonstração)";
            callback.onResult(resultado);
        }, 1500L);
    }
}
