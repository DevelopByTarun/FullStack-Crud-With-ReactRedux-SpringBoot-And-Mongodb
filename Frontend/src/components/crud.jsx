import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import '../../node_modules/sweetalert2/dist/sweetalert2.min.css';
import '../../node_modules/sweetalert2/dist/sweetalert2';
import '../../node_modules/reactstrap/dist/reactstrap';
import Header from './header/header';
import Footer from './footer/footer';
import Routes from './routing/routes';

const Crud = (props) => {
    return (
        <BrowserRouter>
            <div>
                <Header/>
                <Routes/>
                <Footer/>
            </div>
        </BrowserRouter>
    );
}
export default Crud;
