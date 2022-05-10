import React from 'react'
import { Route, Routes } from 'react-router-dom'
import { Grid } from 'semantic-ui-react'
import AboutUs from '../Pages/AboutUs'
import Contact from '../Pages/Contact'
import EmployerList from '../Pages/EmployerList'
import FirstPage from '../Pages/FirstPage'
import JobDetail from '../Pages/JobDetail'
import JobPostingList from '../Pages/JobPostingList'
import Categories from './Categories'

export default function Dashboard() {
    return (
        <div>
            <Grid >
                <Grid.Row >
                    <Grid.Column width={4}>
                        <Categories />
                    </Grid.Column>
                    <Grid.Column width={12}>
                        <Routes>
                            <Route path='/' element={<FirstPage />} />
                            <Route path='/jobpostings' element={<JobPostingList />} />
                            <Route path='/jobposting/:id' element={<JobDetail />} />
                            <Route path='/employers' element={<EmployerList />} />
                            <Route path='/contact' element={<Contact />} />
                            <Route path='/aboutus' element={<AboutUs />} />
                        </Routes>
                    </Grid.Column>
                </Grid.Row>
            </Grid>
        </div>
    )
}
