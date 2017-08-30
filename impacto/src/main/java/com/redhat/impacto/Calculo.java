package com.redhat.impacto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Calculo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer scoreOrigem;
   private java.lang.Integer scoreDestino;
   private java.lang.String segmentoDestino;
   private java.lang.String ratingDestino;
   private java.lang.String setorOrigem;
   private java.lang.Integer pagamento;

   private java.util.List<com.redhat.impacto.Recebimento> recebimentos;

   public Calculo()
   {
   }

   public java.lang.Integer getScoreOrigem()
   {
      return this.scoreOrigem;
   }

   public void setScoreOrigem(java.lang.Integer scoreOrigem)
   {
      this.scoreOrigem = scoreOrigem;
   }

   public java.lang.Integer getScoreDestino()
   {
      return this.scoreDestino;
   }

   public void setScoreDestino(java.lang.Integer scoreDestino)
   {
      this.scoreDestino = scoreDestino;
   }

   public java.lang.String getSegmentoDestino()
   {
      return this.segmentoDestino;
   }

   public void setSegmentoDestino(java.lang.String segmentoDestino)
   {
      this.segmentoDestino = segmentoDestino;
   }

   public java.lang.String getRatingDestino()
   {
      return this.ratingDestino;
   }

   public void setRatingDestino(java.lang.String ratingDestino)
   {
      this.ratingDestino = ratingDestino;
   }

   public java.lang.String getSetorOrigem()
   {
      return this.setorOrigem;
   }

   public void setSetorOrigem(java.lang.String setorOrigem)
   {
      this.setorOrigem = setorOrigem;
   }

   public java.lang.Integer getPagamento()
   {
      return this.pagamento;
   }

   public void setPagamento(java.lang.Integer pagamento)
   {
      this.pagamento = pagamento;
   }

   public java.util.List<com.redhat.impacto.Recebimento> getRecebimentos()
   {
      return this.recebimentos;
   }

   public void setRecebimentos(
         java.util.List<com.redhat.impacto.Recebimento> recebimentos)
   {
      this.recebimentos = recebimentos;
   }

   public Calculo(java.lang.Integer scoreOrigem, java.lang.Integer scoreDestino,
         java.lang.String segmentoDestino, java.lang.String ratingDestino,
         java.lang.String setorOrigem, java.lang.Integer pagamento,
         java.util.List<com.redhat.impacto.Recebimento> recebimentos)
   {
      this.scoreOrigem = scoreOrigem;
      this.scoreDestino = scoreDestino;
      this.segmentoDestino = segmentoDestino;
      this.ratingDestino = ratingDestino;
      this.setorOrigem = setorOrigem;
      this.pagamento = pagamento;
      this.recebimentos = recebimentos;
   }

}