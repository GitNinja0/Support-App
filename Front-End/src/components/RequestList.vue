<template>
    <div>
        <h2>Mi Lista</h2>

        <div class="list">
            <h3>Nº</h3>
            <h3>Tipo de Solicitud</h3>
            <h3>Detalles</h3>
            <h3>Fecha</h3>
        </div>
    </div>
</template>
<style lang="scss" scoped>
div{
    background-color: #EEC643;

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
}
</style>