package org.example;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(this.refNoEntradaFila);
        this.refNoEntradaFila = novoNo;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();

                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No getRefNoEntradaFila() {
        return refNoEntradaFila;
    }

    public void setRefNoEntradaFila(No refNoEntradaFila) {
        this.refNoEntradaFila = refNoEntradaFila;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;

        if (!isEmpty()) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }

    public boolean isEmpty() {
        return this.refNoEntradaFila == null ? true : false;
    }
}
