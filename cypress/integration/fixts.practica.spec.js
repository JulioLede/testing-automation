// fixts.practica.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test

describe('Pruebas de inicio de sesión', () => {

    beforeEach(() => {
      cy.visit('http://uitestingplayground.com/sampleapp')  // Ajusta esto a la URL de tu formulario de inicio de sesión.
    })
  
    it('Realizar pruebas basadas en datos', () => {
      cy.fixture('userpass').then((testCases) => {
        testCases.forEach(testCase => {
          cy.get('input[name=UserName]').clear().type(testCase.credentials.username)
          cy.get('input[name=Password]').clear().type(testCase.credentials.password)
          cy.get('#login').click()

          if (testCase.expectedError) {
            // Verificar el mensaje de error.
          cy.contains(testCase.expectedError).should('be.visible')
        } else {
            cy.get('#loginstatus').should('exist')
          // Aquí debes agregar las aserciones para verificar que el inicio de sesión fue exitoso.
          // Por ejemplo, puedes verificar que se redirige a una página específica o que aparece un mensaje de bienvenida.
        }

        // Regresar a la página de inicio de sesión para el próximo caso de prueba.
        cy.visit('http://uitestingplayground.com/sampleapp')
      })
    })
  })

})



/*describe('My first practice', () => {
    it('Automate a login process', () => {
      cy.visit('http://uitestingplayground.com/sampleapp')

      cy.get("input[name=UserName]").type('fake@email.com').should('have.value', 'fake@email.com')

      cy.get("input[name=Password]").type('pwd').should('have.value', 'pwd')

      cy.get("#login").click()


    })
  })*/