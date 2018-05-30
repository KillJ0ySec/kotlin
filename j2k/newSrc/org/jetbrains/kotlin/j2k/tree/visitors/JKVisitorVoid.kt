package org.jetbrains.kotlin.j2k.tree.visitors

import org.jetbrains.kotlin.j2k.tree.*

interface JKVisitorVoid : JKVisitor<Unit, Nothing?> {
    fun visitTreeElement(treeElement: JKTreeElement) 
    override fun visitTreeElement(treeElement: JKTreeElement, data: Nothing?) = visitTreeElement(treeElement)
    fun visitDeclaration(declaration: JKDeclaration) = visitTreeElement(declaration, null)
    override fun visitDeclaration(declaration: JKDeclaration, data: Nothing?) = visitDeclaration(declaration)
    fun visitClass(klass: JKClass) = visitDeclaration(klass, null)
    override fun visitClass(klass: JKClass, data: Nothing?) = visitClass(klass)
    fun visitMethod(method: JKMethod) = visitDeclaration(method, null)
    override fun visitMethod(method: JKMethod, data: Nothing?) = visitMethod(method)
    fun visitField(field: JKField) = visitDeclaration(field, null)
    override fun visitField(field: JKField, data: Nothing?) = visitField(field)
    fun visitLocalVariable(localVariable: JKLocalVariable) = visitField(localVariable, null)
    override fun visitLocalVariable(localVariable: JKLocalVariable, data: Nothing?) = visitLocalVariable(localVariable)
    fun visitModifier(modifier: JKModifier) = visitTreeElement(modifier, null)
    override fun visitModifier(modifier: JKModifier, data: Nothing?) = visitModifier(modifier)
    fun visitModifierList(modifierList: JKModifierList) = visitTreeElement(modifierList, null)
    override fun visitModifierList(modifierList: JKModifierList, data: Nothing?) = visitModifierList(modifierList)
    fun visitAccessModifier(accessModifier: JKAccessModifier) = visitModifier(accessModifier, null)
    override fun visitAccessModifier(accessModifier: JKAccessModifier, data: Nothing?) = visitAccessModifier(accessModifier)
    fun visitModalityModifier(modalityModifier: JKModalityModifier) = visitModifier(modalityModifier, null)
    override fun visitModalityModifier(modalityModifier: JKModalityModifier, data: Nothing?) = visitModalityModifier(modalityModifier)
    fun visitTypeElement(typeElement: JKTypeElement) = visitTreeElement(typeElement, null)
    override fun visitTypeElement(typeElement: JKTypeElement, data: Nothing?) = visitTypeElement(typeElement)
    fun visitStatement(statement: JKStatement) = visitTreeElement(statement, null)
    override fun visitStatement(statement: JKStatement, data: Nothing?) = visitStatement(statement)
    fun visitBlock(block: JKBlock) = visitTreeElement(block, null)
    override fun visitBlock(block: JKBlock, data: Nothing?) = visitBlock(block)
    fun visitIdentifier(identifier: JKIdentifier) = visitTreeElement(identifier, null)
    override fun visitIdentifier(identifier: JKIdentifier, data: Nothing?) = visitIdentifier(identifier)
    fun visitNameIdentifier(nameIdentifier: JKNameIdentifier) = visitIdentifier(nameIdentifier, null)
    override fun visitNameIdentifier(nameIdentifier: JKNameIdentifier, data: Nothing?) = visitNameIdentifier(nameIdentifier)
    fun visitExpression(expression: JKExpression) = visitTreeElement(expression, null)
    override fun visitExpression(expression: JKExpression, data: Nothing?) = visitExpression(expression)
    fun visitExpressionStatement(expressionStatement: JKExpressionStatement) = visitStatement(expressionStatement, null)
    override fun visitExpressionStatement(expressionStatement: JKExpressionStatement, data: Nothing?) = visitExpressionStatement(expressionStatement)
    fun visitDeclarationStatement(declarationStatement: JKDeclarationStatement) = visitStatement(declarationStatement, null)
    override fun visitDeclarationStatement(declarationStatement: JKDeclarationStatement, data: Nothing?) = visitDeclarationStatement(declarationStatement)
    fun visitBinaryExpression(binaryExpression: JKBinaryExpression) = visitExpression(binaryExpression, null)
    override fun visitBinaryExpression(binaryExpression: JKBinaryExpression, data: Nothing?) = visitBinaryExpression(binaryExpression)
    fun visitUnaryExpression(unaryExpression: JKUnaryExpression) = visitExpression(unaryExpression, null)
    override fun visitUnaryExpression(unaryExpression: JKUnaryExpression, data: Nothing?) = visitUnaryExpression(unaryExpression)
    fun visitPrefixExpression(prefixExpression: JKPrefixExpression) = visitUnaryExpression(prefixExpression, null)
    override fun visitPrefixExpression(prefixExpression: JKPrefixExpression, data: Nothing?) = visitPrefixExpression(prefixExpression)
    fun visitPostfixExpression(postfixExpression: JKPostfixExpression) = visitUnaryExpression(postfixExpression, null)
    override fun visitPostfixExpression(postfixExpression: JKPostfixExpression, data: Nothing?) = visitPostfixExpression(postfixExpression)
    fun visitQualifiedExpression(qualifiedExpression: JKQualifiedExpression) = visitExpression(qualifiedExpression, null)
    override fun visitQualifiedExpression(qualifiedExpression: JKQualifiedExpression, data: Nothing?) = visitQualifiedExpression(qualifiedExpression)
    fun visitMethodCallExpression(methodCallExpression: JKMethodCallExpression) = visitExpression(methodCallExpression, null)
    override fun visitMethodCallExpression(methodCallExpression: JKMethodCallExpression, data: Nothing?) = visitMethodCallExpression(methodCallExpression)
    fun visitFieldAccessExpression(fieldAccessExpression: JKFieldAccessExpression) = visitExpression(fieldAccessExpression, null)
    override fun visitFieldAccessExpression(fieldAccessExpression: JKFieldAccessExpression, data: Nothing?) = visitFieldAccessExpression(fieldAccessExpression)
    fun visitArrayAccessExpression(arrayAccessExpression: JKArrayAccessExpression) = visitExpression(arrayAccessExpression, null)
    override fun visitArrayAccessExpression(arrayAccessExpression: JKArrayAccessExpression, data: Nothing?) = visitArrayAccessExpression(arrayAccessExpression)
    fun visitParenthesizedExpression(parenthesizedExpression: JKParenthesizedExpression) = visitExpression(parenthesizedExpression, null)
    override fun visitParenthesizedExpression(parenthesizedExpression: JKParenthesizedExpression, data: Nothing?) = visitParenthesizedExpression(parenthesizedExpression)
    fun visitTypeCastExpression(typeCastExpression: JKTypeCastExpression) = visitExpression(typeCastExpression, null)
    override fun visitTypeCastExpression(typeCastExpression: JKTypeCastExpression, data: Nothing?) = visitTypeCastExpression(typeCastExpression)
    fun visitExpressionList(expressionList: JKExpressionList) = visitTreeElement(expressionList, null)
    override fun visitExpressionList(expressionList: JKExpressionList, data: Nothing?) = visitExpressionList(expressionList)
    fun visitLiteralExpression(literalExpression: JKLiteralExpression) = visitExpression(literalExpression, null)
    override fun visitLiteralExpression(literalExpression: JKLiteralExpression, data: Nothing?) = visitLiteralExpression(literalExpression)
    fun visitValueArgument(valueArgument: JKValueArgument) = visitTreeElement(valueArgument, null)
    override fun visitValueArgument(valueArgument: JKValueArgument, data: Nothing?) = visitValueArgument(valueArgument)
    fun visitStringLiteralExpression(stringLiteralExpression: JKStringLiteralExpression) = visitLiteralExpression(stringLiteralExpression, null)
    override fun visitStringLiteralExpression(stringLiteralExpression: JKStringLiteralExpression, data: Nothing?) = visitStringLiteralExpression(stringLiteralExpression)
    fun visitStubExpression(stubExpression: JKStubExpression) = visitExpression(stubExpression, null)
    override fun visitStubExpression(stubExpression: JKStubExpression, data: Nothing?) = visitStubExpression(stubExpression)
    fun visitLoopStatement(loopStatement: JKLoopStatement) = visitStatement(loopStatement, null)
    override fun visitLoopStatement(loopStatement: JKLoopStatement, data: Nothing?) = visitLoopStatement(loopStatement)
    fun visitBlockStatement(blockStatement: JKBlockStatement) = visitStatement(blockStatement, null)
    override fun visitBlockStatement(blockStatement: JKBlockStatement, data: Nothing?) = visitBlockStatement(blockStatement)
    fun visitJavaField(javaField: JKJavaField) = visitField(javaField, null)
    override fun visitJavaField(javaField: JKJavaField, data: Nothing?) = visitJavaField(javaField)
    fun visitJavaMethod(javaMethod: JKJavaMethod) = visitMethod(javaMethod, null)
    override fun visitJavaMethod(javaMethod: JKJavaMethod, data: Nothing?) = visitJavaMethod(javaMethod)
    fun visitJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression) = visitExpression(javaAssignmentExpression, null)
    override fun visitJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression, data: Nothing?) = visitJavaAssignmentExpression(javaAssignmentExpression)
    fun visitJavaMethodCallExpression(javaMethodCallExpression: JKJavaMethodCallExpression) = visitMethodCallExpression(javaMethodCallExpression, null)
    override fun visitJavaMethodCallExpression(javaMethodCallExpression: JKJavaMethodCallExpression, data: Nothing?) = visitJavaMethodCallExpression(javaMethodCallExpression)
    fun visitJavaFieldAccessExpression(javaFieldAccessExpression: JKJavaFieldAccessExpression) = visitFieldAccessExpression(javaFieldAccessExpression, null)
    override fun visitJavaFieldAccessExpression(javaFieldAccessExpression: JKJavaFieldAccessExpression, data: Nothing?) = visitJavaFieldAccessExpression(javaFieldAccessExpression)
    fun visitJavaNewExpression(javaNewExpression: JKJavaNewExpression) = visitExpression(javaNewExpression, null)
    override fun visitJavaNewExpression(javaNewExpression: JKJavaNewExpression, data: Nothing?) = visitJavaNewExpression(javaNewExpression)
    fun visitJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier) = visitAccessModifier(javaAccessModifier, null)
    override fun visitJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier, data: Nothing?) = visitJavaAccessModifier(javaAccessModifier)
    fun visitJavaModifier(javaModifier: JKJavaModifier) = visitModifier(javaModifier, null)
    override fun visitJavaModifier(javaModifier: JKJavaModifier, data: Nothing?) = visitJavaModifier(javaModifier)
    fun visitJavaNewEmptyArray(javaNewEmptyArray: JKJavaNewEmptyArray) = visitExpression(javaNewEmptyArray, null)
    override fun visitJavaNewEmptyArray(javaNewEmptyArray: JKJavaNewEmptyArray, data: Nothing?) = visitJavaNewEmptyArray(javaNewEmptyArray)
    fun visitJavaNewArray(javaNewArray: JKJavaNewArray) = visitExpression(javaNewArray, null)
    override fun visitJavaNewArray(javaNewArray: JKJavaNewArray, data: Nothing?) = visitJavaNewArray(javaNewArray)
    fun visitJavaLiteralExpression(javaLiteralExpression: JKJavaLiteralExpression) = visitLiteralExpression(javaLiteralExpression, null)
    override fun visitJavaLiteralExpression(javaLiteralExpression: JKJavaLiteralExpression, data: Nothing?) = visitJavaLiteralExpression(javaLiteralExpression)
    fun visitReturnStatement(returnStatement: JKReturnStatement) = visitStatement(returnStatement, null)
    override fun visitReturnStatement(returnStatement: JKReturnStatement, data: Nothing?) = visitReturnStatement(returnStatement)
    fun visitJavaAssertStatement(javaAssertStatement: JKJavaAssertStatement) = visitStatement(javaAssertStatement, null)
    override fun visitJavaAssertStatement(javaAssertStatement: JKJavaAssertStatement, data: Nothing?) = visitJavaAssertStatement(javaAssertStatement)
    fun visitJavaIfStatement(javaIfStatement: JKJavaIfStatement) = visitStatement(javaIfStatement, null)
    override fun visitJavaIfStatement(javaIfStatement: JKJavaIfStatement, data: Nothing?) = visitJavaIfStatement(javaIfStatement)
    fun visitJavaIfElseStatement(javaIfElseStatement: JKJavaIfElseStatement) = visitJavaIfStatement(javaIfElseStatement, null)
    override fun visitJavaIfElseStatement(javaIfElseStatement: JKJavaIfElseStatement, data: Nothing?) = visitJavaIfElseStatement(javaIfElseStatement)
    fun visitJavaForLoopStatement(javaForLoopStatement: JKJavaForLoopStatement) = visitLoopStatement(javaForLoopStatement, null)
    override fun visitJavaForLoopStatement(javaForLoopStatement: JKJavaForLoopStatement, data: Nothing?) = visitJavaForLoopStatement(javaForLoopStatement)
    fun visitJavaInstanceOfExpression(javaInstanceOfExpression: JKJavaInstanceOfExpression) = visitExpression(javaInstanceOfExpression, null)
    override fun visitJavaInstanceOfExpression(javaInstanceOfExpression: JKJavaInstanceOfExpression, data: Nothing?) = visitJavaInstanceOfExpression(javaInstanceOfExpression)
    fun visitKtProperty(ktProperty: JKKtProperty) = visitField(ktProperty, null)
    override fun visitKtProperty(ktProperty: JKKtProperty, data: Nothing?) = visitKtProperty(ktProperty)
    fun visitKtFunction(ktFunction: JKKtFunction) = visitMethod(ktFunction, null)
    override fun visitKtFunction(ktFunction: JKKtFunction, data: Nothing?) = visitKtFunction(ktFunction)
    fun visitKtConstructor(ktConstructor: JKKtConstructor) = visitDeclaration(ktConstructor, null)
    override fun visitKtConstructor(ktConstructor: JKKtConstructor, data: Nothing?) = visitKtConstructor(ktConstructor)
    fun visitKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor) = visitKtConstructor(ktPrimaryConstructor, null)
    override fun visitKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor, data: Nothing?) = visitKtPrimaryConstructor(ktPrimaryConstructor)
    fun visitKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement) = visitStatement(ktAssignmentStatement, null)
    override fun visitKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement, data: Nothing?) = visitKtAssignmentStatement(ktAssignmentStatement)
    fun visitKtCall(ktCall: JKKtCall) = visitMethodCallExpression(ktCall, null)
    override fun visitKtCall(ktCall: JKKtCall, data: Nothing?) = visitKtCall(ktCall)
    fun visitKtModifier(ktModifier: JKKtModifier) = visitModifier(ktModifier, null)
    override fun visitKtModifier(ktModifier: JKKtModifier, data: Nothing?) = visitKtModifier(ktModifier)
    fun visitKtMethodCallExpression(ktMethodCallExpression: JKKtMethodCallExpression) = visitMethodCallExpression(ktMethodCallExpression, null)
    override fun visitKtMethodCallExpression(ktMethodCallExpression: JKKtMethodCallExpression, data: Nothing?) = visitKtMethodCallExpression(ktMethodCallExpression)
    fun visitKtFieldAccessExpression(ktFieldAccessExpression: JKKtFieldAccessExpression) = visitFieldAccessExpression(ktFieldAccessExpression, null)
    override fun visitKtFieldAccessExpression(ktFieldAccessExpression: JKKtFieldAccessExpression, data: Nothing?) = visitKtFieldAccessExpression(ktFieldAccessExpression)
    fun visitKtLiteralExpression(ktLiteralExpression: JKKtLiteralExpression) = visitLiteralExpression(ktLiteralExpression, null)
    override fun visitKtLiteralExpression(ktLiteralExpression: JKKtLiteralExpression, data: Nothing?) = visitKtLiteralExpression(ktLiteralExpression)
}
