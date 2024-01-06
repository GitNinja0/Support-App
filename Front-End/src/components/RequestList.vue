<template>
    <div class="primary">
        
        <section>
            <h2>Mi Lista</h2>
            <div class="list">
                <h3>Nº</h3>
                <h3>Tipo de Solicitud</h3>
                <h3>Detalles</h3>
                <h3>Fecha</h3>
            </div>
            <div class="elements">
                <p>1</p>
                <p>Reparacion</p>
                <p>no enciende</p>
                <p>ayer</p>
            </div>
        </section>
    </div>
</template>
<style lang="scss" scoped>
.primary{
    display: grid;
    justify-items: center;
    margin-top: 1rem;
    margin-bottom: 1rem;
}
section{
    background-color: #EEC643;
    min-height: 75vh;
    width: 90%;
    border-radius: 20px;

    h2{
        text-align: center;
        text-transform: uppercase;
        padding-top: 1rem;
    }
    .list{
        display: grid;
        grid-template-columns: repeat(5, 1fr);
        justify-items: center;
        gap: 1rem;
        border-bottom: #000 solid 1px;
    }
    .elements{
        display: grid;
        grid-template-columns: repeat(5, 1fr);
        justify-items: center;
        gap: 1rem;
    }
}
</style>