// untitled.spec.js created with Cypress
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

  describe('My First Test', () => {
    it('Gets, types and asserts', () => {
      cy.visit('https://example.cypress.io')

      cy.contains('type').click()

      // Should be on a new URL which
      // includes '/commands/actions'
      cy.url().should('include', '/commands/actions')
     // Get an input, type into it
     cy.get('.action-email').type('fake@email.com')
     //  Verify that the value has been updated
     cy.get('.action-email').should('have.value', 'fake@email.com')
    })
  })
  /*este no va porque es el que falla de ejemplo
   describe('My First Test', () => {
    it('Does not do much!', () => {
      expect(true).to.equal(false)
    })
  })*/
