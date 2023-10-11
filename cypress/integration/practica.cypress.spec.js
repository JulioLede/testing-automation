// practica.cypress.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test
describe('My First Test', () => {
    it('Does not do much!', () => {
      expect(true).to.equal(true)
    })
  })

  describe('My first practice', () => {
    it('Automate a login process', () => {
      cy.visit('http://uitestingplayground.com/sampleapp')

      cy.get("input[name=UserName]").type('fake@email.com').should('have.value', 'fake@email.com')

      cy.get("input[name=Password]").type('pwd').should('have.value', 'pwd')

      cy.get("#login").click()


    })
  })

       /*cy.get('.action-email').type('fake@email.com')
     //  Verify that the value has been updated
     cy.get('.action-email').should('have.value', 'fake@email.com')*/

  /*para confirmar que uno se pasó a otra instancia post-login
  cy.url().should('include', '/commands/actions') */
  /*este no va porque es el que falla de ejemplo
   describe('My First Test', () => {
    it('Does not do much!', () => {
      expect(true).to.equal(false)
    })
  })*/