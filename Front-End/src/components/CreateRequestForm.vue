<template>
    <div class="primary">
        <section>
            <h2>Hacer Solicitud</h2>
            
            <form @submit.prevent>
                <label for="name">
                    <p>Nombre</p>
                    <input type="text">
                </label>
                
                <label for="request">
                    <p>Tipo de solicitud</p>
                    <select name="request" id="optionRequest">
                        <option value="mantenimiento">Mantenimiento</option>
                        <option value="reparacion">Reparación</option>
                        <option value="revision">Revisión</option>
                        <option value="instalacion">Instalación</option>
                    </select>
                </label>
                
                
                <label for="date">
                    <p>Fecha</p>
                    <input type="date" name="date" id="date">
                </label>

                <label for="detais">
                    <p>Detalles de la Solicitud</p>
                    <textarea name="details" id="details" cols="30" rows="5">Escribe los detalles aqui</textarea>
                </label>

                <button type="submit">Enviar</button>
            </form>
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
}
form{
    display: grid;
    grid-template-columns: repeat(3,1fr);
    grid-template-rows: repeat(3, 1fr);
    grid-template-areas: 
    "a b c"
    "d f g"
    "h i j"
    ;
    justify-items: center;
    align-items: center;

    p{
        font-size: 18px;
        font-weight: 600;
    }
    input{
        width: 260px;
        height: 35px;
        border-radius: 20px;
    }
    select{
        width: 260px;
        height: 35px;
        border-radius: 20px;
    }
    textarea{
        border-radius: 20px;
    }
    
    button{
        grid-area: j;
        
        height: 60px;
        width: 200px;
        background-color: #011638;
        color: #EEF0F2;
        border: none;
        border-radius: 20px;
        text-transform: uppercase;
        font-size: 20px;
        font-weight: 700;
        text-decoration: none;
    }
}
</style>