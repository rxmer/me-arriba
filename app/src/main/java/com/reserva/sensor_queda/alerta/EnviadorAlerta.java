package com.reserva.sensor_queda.alerta;

public interface EnviadorAlerta {

    interface Callback {
        void onResult(ResultadoAlerta resultado);
    }

    void enviar(String payload, Callback callback);
}
