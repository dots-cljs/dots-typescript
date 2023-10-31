(ns dots.typescript.factory
  (:require ["typescript" :as typescript]))

(defn create-node-array
  (^js []
   (.createNodeArray typescript/factory))
  (^js [elements]
   (.createNodeArray typescript/factory elements))
  (^js [elements has-trailing-comma?]
   (.createNodeArray typescript/factory elements has-trailing-comma?)))

(defn create-numeric-literal
  (^js [value]
   (.createNumericLiteral typescript/factory value))
  (^js [value numeric-literal-flags]
   (.createNumericLiteral typescript/factory value numeric-literal-flags)))

(defn create-big-int-literal
  ^js [value]
  (.createBigIntLiteral typescript/factory value))

(defn create-string-literal
  (^js [text]
   (.createStringLiteral typescript/factory text))
  (^js [text single-quote?]
   (.createStringLiteral typescript/factory text single-quote?)))

(defn create-string-literal-from-node
  (^js [source-node]
   (.createStringLiteralFromNode typescript/factory source-node))
  (^js [source-node single-quote?]
   (.createStringLiteralFromNode typescript/factory source-node single-quote?)))

(defn create-regular-expression-literal
  ^js [text]
  (.createRegularExpressionLiteral typescript/factory text))

(defn create-identifier
  ^js [text]
  (.createIdentifier typescript/factory text))

(defn create-temp-variable
  "Create a unique temporary variable."
  (^js []
   (.createTempVariable typescript/factory))
  (^js [record-temp-variable]
   (.createTempVariable typescript/factory record-temp-variable))
  (^js [record-temp-variable reserved-in-nested-scopes?]
   (.createTempVariable typescript/factory record-temp-variable reserved-in-nested-scopes?)))

(defn create-loop-variable
  "Create a unique temporary variable for use in a loop."
  (^js []
   (.createLoopVariable typescript/factory))
  (^js [reserved-in-nested-scopes?]
   (.createLoopVariable typescript/factory reserved-in-nested-scopes?)))

(defn create-unique-name
  "Create a unique name based on the supplied text."
  (^js [text]
   (.createUniqueName typescript/factory text))
  (^js [text flags]
   (.createUniqueName typescript/factory text flags)))

(defn generated-name-for-node
  "Create a unique name generated for a node."
  (^js []
   (.getGeneratedNameForNode typescript/factory))
  (^js [node]
   (.getGeneratedNameForNode typescript/factory node))
  (^js [node flags]
   (.getGeneratedNameForNode typescript/factory node flags)))

(defn create-private-identifier
  ^js [text]
  (.createPrivateIdentifier typescript/factory text))

(defn create-unique-private-name
  (^js []
   (.createUniquePrivateName typescript/factory))
  (^js [text]
   (.createUniquePrivateName typescript/factory text)))

(defn generated-private-name-for-node
  ^js [node]
  (.getGeneratedPrivateNameForNode typescript/factory node))

(defn create-token
  ^js [token]
  (.createToken typescript/factory token))

(defn create-super
  ^js []
  (.createSuper typescript/factory))

(defn create-this
  ^js []
  (.createThis typescript/factory))

(defn create-null
  ^js []
  (.createNull typescript/factory))

(defn create-true
  ^js []
  (.createTrue typescript/factory))

(defn create-false
  ^js []
  (.createFalse typescript/factory))

(defn create-modifier
  ^js [kind]
  (.createModifier typescript/factory kind))

(defn create-modifiers-from-modifier-flags
  ^js [flags]
  (.createModifiersFromModifierFlags typescript/factory flags))

(defn create-qualified-name
  ^js [left right]
  (.createQualifiedName typescript/factory left right))

(defn update-qualified-name
  ^js [node left right]
  (.updateQualifiedName typescript/factory node left right))

(defn create-computed-property-name
  ^js [expression]
  (.createComputedPropertyName typescript/factory expression))

(defn update-computed-property-name
  ^js [node expression]
  (.updateComputedPropertyName typescript/factory node expression))

(defn create-type-parameter-declaration
  (^js []
   (.createTypeParameterDeclaration typescript/factory))
  (^js [modifiers]
   (.createTypeParameterDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createTypeParameterDeclaration typescript/factory modifiers name))
  (^js [modifiers name constraint]
   (.createTypeParameterDeclaration typescript/factory modifiers name constraint))
  (^js [modifiers name constraint default-type]
   (.createTypeParameterDeclaration typescript/factory modifiers name constraint default-type)))

(defn update-type-parameter-declaration
  (^js [node]
   (.updateTypeParameterDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateTypeParameterDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name constraint]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name constraint))
  (^js [node modifiers name constraint default-type]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name constraint default-type)))

(defn create-parameter-declaration
  (^js []
   (.createParameterDeclaration typescript/factory))
  (^js [modifiers]
   (.createParameterDeclaration typescript/factory modifiers))
  (^js [modifiers dot-dot-dot-token]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token))
  (^js [modifiers dot-dot-dot-token name]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name))
  (^js [modifiers dot-dot-dot-token name question-token]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name question-token))
  (^js [modifiers dot-dot-dot-token name question-token type]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name question-token type))
  (^js [modifiers dot-dot-dot-token name question-token type initializer]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name question-token type initializer)))

(defn update-parameter-declaration
  (^js [node]
   (.updateParameterDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateParameterDeclaration typescript/factory node modifiers))
  (^js [node modifiers dot-dot-dot-token]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token))
  (^js [node modifiers dot-dot-dot-token name]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name))
  (^js [node modifiers dot-dot-dot-token name question-token]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name question-token))
  (^js [node modifiers dot-dot-dot-token name question-token type]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name question-token type))
  (^js [node modifiers dot-dot-dot-token name question-token type initializer]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name question-token type initializer)))

(defn create-decorator
  ^js [expression]
  (.createDecorator typescript/factory expression))

(defn update-decorator
  ^js [node expression]
  (.updateDecorator typescript/factory node expression))

(defn create-property-signature
  (^js []
   (.createPropertySignature typescript/factory))
  (^js [modifiers]
   (.createPropertySignature typescript/factory modifiers))
  (^js [modifiers name]
   (.createPropertySignature typescript/factory modifiers name))
  (^js [modifiers name question-token]
   (.createPropertySignature typescript/factory modifiers name question-token))
  (^js [modifiers name question-token type]
   (.createPropertySignature typescript/factory modifiers name question-token type)))

(defn update-property-signature
  (^js [node]
   (.updatePropertySignature typescript/factory node))
  (^js [node modifiers]
   (.updatePropertySignature typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updatePropertySignature typescript/factory node modifiers name))
  (^js [node modifiers name question-token]
   (.updatePropertySignature typescript/factory node modifiers name question-token))
  (^js [node modifiers name question-token type]
   (.updatePropertySignature typescript/factory node modifiers name question-token type)))

(defn create-property-declaration
  (^js []
   (.createPropertyDeclaration typescript/factory))
  (^js [modifiers]
   (.createPropertyDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createPropertyDeclaration typescript/factory modifiers name))
  (^js [modifiers name question-or-exclamation-token]
   (.createPropertyDeclaration typescript/factory modifiers name question-or-exclamation-token))
  (^js [modifiers name question-or-exclamation-token type]
   (.createPropertyDeclaration typescript/factory modifiers name question-or-exclamation-token type))
  (^js [modifiers name question-or-exclamation-token type initializer]
   (.createPropertyDeclaration typescript/factory modifiers name question-or-exclamation-token type initializer)))

(defn update-property-declaration
  (^js [node]
   (.updatePropertyDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updatePropertyDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updatePropertyDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name question-or-exclamation-token]
   (.updatePropertyDeclaration typescript/factory node modifiers name question-or-exclamation-token))
  (^js [node modifiers name question-or-exclamation-token type]
   (.updatePropertyDeclaration typescript/factory node modifiers name question-or-exclamation-token type))
  (^js [node modifiers name question-or-exclamation-token type initializer]
   (.updatePropertyDeclaration typescript/factory node modifiers name question-or-exclamation-token type initializer)))

(defn create-method-signature
  (^js []
   (.createMethodSignature typescript/factory))
  (^js [modifiers]
   (.createMethodSignature typescript/factory modifiers))
  (^js [modifiers name]
   (.createMethodSignature typescript/factory modifiers name))
  (^js [modifiers name question-token]
   (.createMethodSignature typescript/factory modifiers name question-token))
  (^js [modifiers name question-token type-parameters]
   (.createMethodSignature typescript/factory modifiers name question-token type-parameters))
  (^js [modifiers name question-token type-parameters parameters]
   (.createMethodSignature typescript/factory modifiers name question-token type-parameters parameters))
  (^js [modifiers name question-token type-parameters parameters type]
   (.createMethodSignature typescript/factory modifiers name question-token type-parameters parameters type)))

(defn update-method-signature
  (^js [node]
   (.updateMethodSignature typescript/factory node))
  (^js [node modifiers]
   (.updateMethodSignature typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateMethodSignature typescript/factory node modifiers name))
  (^js [node modifiers name question-token]
   (.updateMethodSignature typescript/factory node modifiers name question-token))
  (^js [node modifiers name question-token type-parameters]
   (.updateMethodSignature typescript/factory node modifiers name question-token type-parameters))
  (^js [node modifiers name question-token type-parameters parameters]
   (.updateMethodSignature typescript/factory node modifiers name question-token type-parameters parameters))
  (^js [node modifiers name question-token type-parameters parameters type]
   (.updateMethodSignature typescript/factory node modifiers name question-token type-parameters parameters type)))

(defn create-method-declaration
  (^js []
   (.createMethodDeclaration typescript/factory))
  (^js [modifiers]
   (.createMethodDeclaration typescript/factory modifiers))
  (^js [modifiers asterisk-token]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token))
  (^js [modifiers asterisk-token name]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name))
  (^js [modifiers asterisk-token name question-token]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token))
  (^js [modifiers asterisk-token name question-token type-parameters]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters))
  (^js [modifiers asterisk-token name question-token type-parameters parameters]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters parameters))
  (^js [modifiers asterisk-token name question-token type-parameters parameters type]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters parameters type))
  (^js [modifiers asterisk-token name question-token type-parameters parameters type body]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn update-method-declaration
  (^js [node]
   (.updateMethodDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateMethodDeclaration typescript/factory node modifiers))
  (^js [node modifiers asterisk-token]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token))
  (^js [node modifiers asterisk-token name]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name))
  (^js [node modifiers asterisk-token name question-token]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token))
  (^js [node modifiers asterisk-token name question-token type-parameters]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters))
  (^js [node modifiers asterisk-token name question-token type-parameters parameters]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters parameters))
  (^js [node modifiers asterisk-token name question-token type-parameters parameters type]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters parameters type))
  (^js [node modifiers asterisk-token name question-token type-parameters parameters type body]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn create-constructor-declaration
  (^js []
   (.createConstructorDeclaration typescript/factory))
  (^js [modifiers]
   (.createConstructorDeclaration typescript/factory modifiers))
  (^js [modifiers parameters]
   (.createConstructorDeclaration typescript/factory modifiers parameters))
  (^js [modifiers parameters body]
   (.createConstructorDeclaration typescript/factory modifiers parameters body)))

(defn update-constructor-declaration
  (^js [node]
   (.updateConstructorDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateConstructorDeclaration typescript/factory node modifiers))
  (^js [node modifiers parameters]
   (.updateConstructorDeclaration typescript/factory node modifiers parameters))
  (^js [node modifiers parameters body]
   (.updateConstructorDeclaration typescript/factory node modifiers parameters body)))

(defn create-get-accessor-declaration
  (^js []
   (.createGetAccessorDeclaration typescript/factory))
  (^js [modifiers]
   (.createGetAccessorDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createGetAccessorDeclaration typescript/factory modifiers name))
  (^js [modifiers name parameters]
   (.createGetAccessorDeclaration typescript/factory modifiers name parameters))
  (^js [modifiers name parameters type]
   (.createGetAccessorDeclaration typescript/factory modifiers name parameters type))
  (^js [modifiers name parameters type body]
   (.createGetAccessorDeclaration typescript/factory modifiers name parameters type body)))

(defn update-get-accessor-declaration
  (^js [node]
   (.updateGetAccessorDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateGetAccessorDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name parameters]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name parameters))
  (^js [node modifiers name parameters type]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name parameters type))
  (^js [node modifiers name parameters type body]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name parameters type body)))

(defn create-set-accessor-declaration
  (^js []
   (.createSetAccessorDeclaration typescript/factory))
  (^js [modifiers]
   (.createSetAccessorDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createSetAccessorDeclaration typescript/factory modifiers name))
  (^js [modifiers name parameters]
   (.createSetAccessorDeclaration typescript/factory modifiers name parameters))
  (^js [modifiers name parameters body]
   (.createSetAccessorDeclaration typescript/factory modifiers name parameters body)))

(defn update-set-accessor-declaration
  (^js [node]
   (.updateSetAccessorDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateSetAccessorDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateSetAccessorDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name parameters]
   (.updateSetAccessorDeclaration typescript/factory node modifiers name parameters))
  (^js [node modifiers name parameters body]
   (.updateSetAccessorDeclaration typescript/factory node modifiers name parameters body)))

(defn create-call-signature
  (^js []
   (.createCallSignature typescript/factory))
  (^js [type-parameters]
   (.createCallSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createCallSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createCallSignature typescript/factory type-parameters parameters type)))

(defn update-call-signature
  (^js [node]
   (.updateCallSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateCallSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateCallSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateCallSignature typescript/factory node type-parameters parameters type)))

(defn create-construct-signature
  (^js []
   (.createConstructSignature typescript/factory))
  (^js [type-parameters]
   (.createConstructSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createConstructSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createConstructSignature typescript/factory type-parameters parameters type)))

(defn update-construct-signature
  (^js [node]
   (.updateConstructSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateConstructSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateConstructSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateConstructSignature typescript/factory node type-parameters parameters type)))

(defn create-index-signature
  (^js []
   (.createIndexSignature typescript/factory))
  (^js [modifiers]
   (.createIndexSignature typescript/factory modifiers))
  (^js [modifiers parameters]
   (.createIndexSignature typescript/factory modifiers parameters))
  (^js [modifiers parameters type]
   (.createIndexSignature typescript/factory modifiers parameters type)))

(defn update-index-signature
  (^js [node]
   (.updateIndexSignature typescript/factory node))
  (^js [node modifiers]
   (.updateIndexSignature typescript/factory node modifiers))
  (^js [node modifiers parameters]
   (.updateIndexSignature typescript/factory node modifiers parameters))
  (^js [node modifiers parameters type]
   (.updateIndexSignature typescript/factory node modifiers parameters type)))

(defn create-template-literal-type-span
  ^js [type literal]
  (.createTemplateLiteralTypeSpan typescript/factory type literal))

(defn update-template-literal-type-span
  ^js [node type literal]
  (.updateTemplateLiteralTypeSpan typescript/factory node type literal))

(defn create-class-static-block-declaration
  ^js [body]
  (.createClassStaticBlockDeclaration typescript/factory body))

(defn update-class-static-block-declaration
  ^js [node body]
  (.updateClassStaticBlockDeclaration typescript/factory node body))

(defn create-keyword-type-node
  ^js [kind]
  (.createKeywordTypeNode typescript/factory kind))

(defn create-type-predicate-node
  (^js []
   (.createTypePredicateNode typescript/factory))
  (^js [asserts-modifier]
   (.createTypePredicateNode typescript/factory asserts-modifier))
  (^js [asserts-modifier parameter-name]
   (.createTypePredicateNode typescript/factory asserts-modifier parameter-name))
  (^js [asserts-modifier parameter-name type]
   (.createTypePredicateNode typescript/factory asserts-modifier parameter-name type)))

(defn update-type-predicate-node
  (^js [node]
   (.updateTypePredicateNode typescript/factory node))
  (^js [node asserts-modifier]
   (.updateTypePredicateNode typescript/factory node asserts-modifier))
  (^js [node asserts-modifier parameter-name]
   (.updateTypePredicateNode typescript/factory node asserts-modifier parameter-name))
  (^js [node asserts-modifier parameter-name type]
   (.updateTypePredicateNode typescript/factory node asserts-modifier parameter-name type)))

(defn create-type-reference-node
  (^js [type-name]
   (.createTypeReferenceNode typescript/factory type-name))
  (^js [type-name type-arguments]
   (.createTypeReferenceNode typescript/factory type-name type-arguments)))

(defn update-type-reference-node
  (^js [node type-name]
   (.updateTypeReferenceNode typescript/factory node type-name))
  (^js [node type-name type-arguments]
   (.updateTypeReferenceNode typescript/factory node type-name type-arguments)))

(defn create-function-type-node
  (^js []
   (.createFunctionTypeNode typescript/factory))
  (^js [type-parameters]
   (.createFunctionTypeNode typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createFunctionTypeNode typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createFunctionTypeNode typescript/factory type-parameters parameters type)))

(defn update-function-type-node
  (^js [node]
   (.updateFunctionTypeNode typescript/factory node))
  (^js [node type-parameters]
   (.updateFunctionTypeNode typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateFunctionTypeNode typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateFunctionTypeNode typescript/factory node type-parameters parameters type)))

(defn create-constructor-type-node
  (^js []
   (.createConstructorTypeNode typescript/factory))
  (^js [modifiers]
   (.createConstructorTypeNode typescript/factory modifiers))
  (^js [modifiers type-parameters]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters))
  (^js [modifiers type-parameters parameters]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters parameters))
  (^js [modifiers type-parameters parameters type]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters parameters type)))

(defn update-constructor-type-node
  (^js [node]
   (.updateConstructorTypeNode typescript/factory node))
  (^js [node modifiers]
   (.updateConstructorTypeNode typescript/factory node modifiers))
  (^js [node modifiers type-parameters]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters))
  (^js [node modifiers type-parameters parameters]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters parameters))
  (^js [node modifiers type-parameters parameters type]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters parameters type)))

(defn create-type-query-node
  (^js [expr-name]
   (.createTypeQueryNode typescript/factory expr-name))
  (^js [expr-name type-arguments]
   (.createTypeQueryNode typescript/factory expr-name type-arguments)))

(defn update-type-query-node
  (^js [node expr-name]
   (.updateTypeQueryNode typescript/factory node expr-name))
  (^js [node expr-name type-arguments]
   (.updateTypeQueryNode typescript/factory node expr-name type-arguments)))

(defn create-type-literal-node
  (^js []
   (.createTypeLiteralNode typescript/factory))
  (^js [members]
   (.createTypeLiteralNode typescript/factory members)))

(defn update-type-literal-node
  ^js [node members]
  (.updateTypeLiteralNode typescript/factory node members))

(defn create-array-type-node
  ^js [element-type]
  (.createArrayTypeNode typescript/factory element-type))

(defn update-array-type-node
  ^js [node element-type]
  (.updateArrayTypeNode typescript/factory node element-type))

(defn create-tuple-type-node
  ^js [elements]
  (.createTupleTypeNode typescript/factory elements))

(defn update-tuple-type-node
  ^js [node elements]
  (.updateTupleTypeNode typescript/factory node elements))

(defn create-named-tuple-member
  (^js []
   (.createNamedTupleMember typescript/factory))
  (^js [dot-dot-dot-token]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token name]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token name))
  (^js [dot-dot-dot-token name question-token]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token name question-token))
  (^js [dot-dot-dot-token name question-token type]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token name question-token type)))

(defn update-named-tuple-member
  (^js [node]
   (.updateNamedTupleMember typescript/factory node))
  (^js [node dot-dot-dot-token]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token))
  (^js [node dot-dot-dot-token name]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token name))
  (^js [node dot-dot-dot-token name question-token]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token name question-token))
  (^js [node dot-dot-dot-token name question-token type]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token name question-token type)))

(defn create-optional-type-node
  ^js [type]
  (.createOptionalTypeNode typescript/factory type))

(defn update-optional-type-node
  ^js [node type]
  (.updateOptionalTypeNode typescript/factory node type))

(defn create-rest-type-node
  ^js [type]
  (.createRestTypeNode typescript/factory type))

(defn update-rest-type-node
  ^js [node type]
  (.updateRestTypeNode typescript/factory node type))

(defn create-union-type-node
  ^js [types]
  (.createUnionTypeNode typescript/factory types))

(defn update-union-type-node
  ^js [node types]
  (.updateUnionTypeNode typescript/factory node types))

(defn create-intersection-type-node
  ^js [types]
  (.createIntersectionTypeNode typescript/factory types))

(defn update-intersection-type-node
  ^js [node types]
  (.updateIntersectionTypeNode typescript/factory node types))

(defn create-conditional-type-node
  ^js [check-type extends-type true-type false-type]
  (.createConditionalTypeNode typescript/factory check-type extends-type true-type false-type))

(defn update-conditional-type-node
  ^js [node check-type extends-type true-type false-type]
  (.updateConditionalTypeNode typescript/factory node check-type extends-type true-type false-type))

(defn create-infer-type-node
  ^js [type-parameter]
  (.createInferTypeNode typescript/factory type-parameter))

(defn update-infer-type-node
  ^js [node type-parameter]
  (.updateInferTypeNode typescript/factory node type-parameter))

(defn create-import-type-node
  (^js [argument]
   (.createImportTypeNode typescript/factory argument))
  (^js [argument assertions]
   (.createImportTypeNode typescript/factory argument assertions))
  (^js [argument assertions qualifier]
   (.createImportTypeNode typescript/factory argument assertions qualifier))
  (^js [argument assertions qualifier type-arguments]
   (.createImportTypeNode typescript/factory argument assertions qualifier type-arguments))
  (^js [argument assertions qualifier type-arguments type-of?]
   (.createImportTypeNode typescript/factory argument assertions qualifier type-arguments type-of?)))

(defn update-import-type-node
  (^js [node argument]
   (.updateImportTypeNode typescript/factory node argument))
  (^js [node argument assertions]
   (.updateImportTypeNode typescript/factory node argument assertions))
  (^js [node argument assertions qualifier]
   (.updateImportTypeNode typescript/factory node argument assertions qualifier))
  (^js [node argument assertions qualifier type-arguments]
   (.updateImportTypeNode typescript/factory node argument assertions qualifier type-arguments))
  (^js [node argument assertions qualifier type-arguments type-of?]
   (.updateImportTypeNode typescript/factory node argument assertions qualifier type-arguments type-of?)))

(defn create-parenthesized-type
  ^js [type]
  (.createParenthesizedType typescript/factory type))

(defn update-parenthesized-type
  ^js [node type]
  (.updateParenthesizedType typescript/factory node type))

(defn create-this-type-node
  ^js []
  (.createThisTypeNode typescript/factory))

(defn create-type-operator-node
  ^js [operator type]
  (.createTypeOperatorNode typescript/factory operator type))

(defn update-type-operator-node
  ^js [node type]
  (.updateTypeOperatorNode typescript/factory node type))

(defn create-indexed-access-type-node
  ^js [object-type index-type]
  (.createIndexedAccessTypeNode typescript/factory object-type index-type))

(defn update-indexed-access-type-node
  ^js [node object-type index-type]
  (.updateIndexedAccessTypeNode typescript/factory node object-type index-type))

(defn create-mapped-type-node
  (^js []
   (.createMappedTypeNode typescript/factory))
  (^js [readonly-token]
   (.createMappedTypeNode typescript/factory readonly-token))
  (^js [readonly-token type-parameter]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter))
  (^js [readonly-token type-parameter name-type]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type))
  (^js [readonly-token type-parameter name-type question-token]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type question-token))
  (^js [readonly-token type-parameter name-type question-token type]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type question-token type))
  (^js [readonly-token type-parameter name-type question-token type members]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type question-token type members)))

(defn update-mapped-type-node
  (^js [node]
   (.updateMappedTypeNode typescript/factory node))
  (^js [node readonly-token]
   (.updateMappedTypeNode typescript/factory node readonly-token))
  (^js [node readonly-token type-parameter]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter))
  (^js [node readonly-token type-parameter name-type]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type))
  (^js [node readonly-token type-parameter name-type question-token]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type question-token))
  (^js [node readonly-token type-parameter name-type question-token type]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type question-token type))
  (^js [node readonly-token type-parameter name-type question-token type members]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type question-token type members)))

(defn create-literal-type-node
  ^js [literal]
  (.createLiteralTypeNode typescript/factory literal))

(defn update-literal-type-node
  ^js [node literal]
  (.updateLiteralTypeNode typescript/factory node literal))

(defn create-template-literal-type
  ^js [head template-spans]
  (.createTemplateLiteralType typescript/factory head template-spans))

(defn update-template-literal-type
  ^js [node head template-spans]
  (.updateTemplateLiteralType typescript/factory node head template-spans))

(defn create-object-binding-pattern
  ^js [elements]
  (.createObjectBindingPattern typescript/factory elements))

(defn update-object-binding-pattern
  ^js [node elements]
  (.updateObjectBindingPattern typescript/factory node elements))

(defn create-array-binding-pattern
  ^js [elements]
  (.createArrayBindingPattern typescript/factory elements))

(defn update-array-binding-pattern
  ^js [node elements]
  (.updateArrayBindingPattern typescript/factory node elements))

(defn create-binding-element
  (^js []
   (.createBindingElement typescript/factory))
  (^js [dot-dot-dot-token]
   (.createBindingElement typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token property-name]
   (.createBindingElement typescript/factory dot-dot-dot-token property-name))
  (^js [dot-dot-dot-token property-name name]
   (.createBindingElement typescript/factory dot-dot-dot-token property-name name))
  (^js [dot-dot-dot-token property-name name initializer]
   (.createBindingElement typescript/factory dot-dot-dot-token property-name name initializer)))

(defn update-binding-element
  (^js [node]
   (.updateBindingElement typescript/factory node))
  (^js [node dot-dot-dot-token]
   (.updateBindingElement typescript/factory node dot-dot-dot-token))
  (^js [node dot-dot-dot-token property-name]
   (.updateBindingElement typescript/factory node dot-dot-dot-token property-name))
  (^js [node dot-dot-dot-token property-name name]
   (.updateBindingElement typescript/factory node dot-dot-dot-token property-name name))
  (^js [node dot-dot-dot-token property-name name initializer]
   (.updateBindingElement typescript/factory node dot-dot-dot-token property-name name initializer)))

(defn create-array-literal-expression
  (^js []
   (.createArrayLiteralExpression typescript/factory))
  (^js [elements]
   (.createArrayLiteralExpression typescript/factory elements))
  (^js [elements multi-line?]
   (.createArrayLiteralExpression typescript/factory elements multi-line?)))

(defn update-array-literal-expression
  ^js [node elements]
  (.updateArrayLiteralExpression typescript/factory node elements))

(defn create-object-literal-expression
  (^js []
   (.createObjectLiteralExpression typescript/factory))
  (^js [properties]
   (.createObjectLiteralExpression typescript/factory properties))
  (^js [properties multi-line?]
   (.createObjectLiteralExpression typescript/factory properties multi-line?)))

(defn update-object-literal-expression
  ^js [node properties]
  (.updateObjectLiteralExpression typescript/factory node properties))

(defn create-property-access-expression
  ^js [expression name]
  (.createPropertyAccessExpression typescript/factory expression name))

(defn update-property-access-expression
  ^js [node expression name]
  (.updatePropertyAccessExpression typescript/factory node expression name))

(defn create-property-access-chain
  (^js [expression]
   (.createPropertyAccessChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createPropertyAccessChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token name]
   (.createPropertyAccessChain typescript/factory expression question-dot-token name)))

(defn update-property-access-chain
  (^js [node expression]
   (.updatePropertyAccessChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updatePropertyAccessChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token name]
   (.updatePropertyAccessChain typescript/factory node expression question-dot-token name)))

(defn create-element-access-expression
  ^js [expression index]
  (.createElementAccessExpression typescript/factory expression index))

(defn update-element-access-expression
  ^js [node expression argument-expression]
  (.updateElementAccessExpression typescript/factory node expression argument-expression))

(defn create-element-access-chain
  (^js [expression]
   (.createElementAccessChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createElementAccessChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token index]
   (.createElementAccessChain typescript/factory expression question-dot-token index)))

(defn update-element-access-chain
  (^js [node expression]
   (.updateElementAccessChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updateElementAccessChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token argument-expression]
   (.updateElementAccessChain typescript/factory node expression question-dot-token argument-expression)))

(defn create-call-expression
  (^js [expression]
   (.createCallExpression typescript/factory expression))
  (^js [expression type-arguments]
   (.createCallExpression typescript/factory expression type-arguments))
  (^js [expression type-arguments arguments-array]
   (.createCallExpression typescript/factory expression type-arguments arguments-array)))

(defn update-call-expression
  (^js [node expression]
   (.updateCallExpression typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateCallExpression typescript/factory node expression type-arguments))
  (^js [node expression type-arguments arguments-array]
   (.updateCallExpression typescript/factory node expression type-arguments arguments-array)))

(defn create-call-chain
  (^js [expression]
   (.createCallChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createCallChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token type-arguments]
   (.createCallChain typescript/factory expression question-dot-token type-arguments))
  (^js [expression question-dot-token type-arguments arguments-array]
   (.createCallChain typescript/factory expression question-dot-token type-arguments arguments-array)))

(defn update-call-chain
  (^js [node expression]
   (.updateCallChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updateCallChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token type-arguments]
   (.updateCallChain typescript/factory node expression question-dot-token type-arguments))
  (^js [node expression question-dot-token type-arguments arguments-array]
   (.updateCallChain typescript/factory node expression question-dot-token type-arguments arguments-array)))

(defn create-new-expression
  (^js [expression]
   (.createNewExpression typescript/factory expression))
  (^js [expression type-arguments]
   (.createNewExpression typescript/factory expression type-arguments))
  (^js [expression type-arguments arguments-array]
   (.createNewExpression typescript/factory expression type-arguments arguments-array)))

(defn update-new-expression
  (^js [node expression]
   (.updateNewExpression typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateNewExpression typescript/factory node expression type-arguments))
  (^js [node expression type-arguments arguments-array]
   (.updateNewExpression typescript/factory node expression type-arguments arguments-array)))

(defn create-tagged-template-expression
  (^js [tag]
   (.createTaggedTemplateExpression typescript/factory tag))
  (^js [tag type-arguments]
   (.createTaggedTemplateExpression typescript/factory tag type-arguments))
  (^js [tag type-arguments template]
   (.createTaggedTemplateExpression typescript/factory tag type-arguments template)))

(defn update-tagged-template-expression
  (^js [node tag]
   (.updateTaggedTemplateExpression typescript/factory node tag))
  (^js [node tag type-arguments]
   (.updateTaggedTemplateExpression typescript/factory node tag type-arguments))
  (^js [node tag type-arguments template]
   (.updateTaggedTemplateExpression typescript/factory node tag type-arguments template)))

(defn create-type-assertion
  ^js [type expression]
  (.createTypeAssertion typescript/factory type expression))

(defn update-type-assertion
  ^js [node type expression]
  (.updateTypeAssertion typescript/factory node type expression))

(defn create-parenthesized-expression
  ^js [expression]
  (.createParenthesizedExpression typescript/factory expression))

(defn update-parenthesized-expression
  ^js [node expression]
  (.updateParenthesizedExpression typescript/factory node expression))

(defn create-function-expression
  (^js []
   (.createFunctionExpression typescript/factory))
  (^js [modifiers]
   (.createFunctionExpression typescript/factory modifiers))
  (^js [modifiers asterisk-token]
   (.createFunctionExpression typescript/factory modifiers asterisk-token))
  (^js [modifiers asterisk-token name]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name))
  (^js [modifiers asterisk-token name type-parameters]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters))
  (^js [modifiers asterisk-token name type-parameters parameters]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters parameters))
  (^js [modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters parameters type))
  (^js [modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-expression
  (^js [node]
   (.updateFunctionExpression typescript/factory node))
  (^js [node modifiers]
   (.updateFunctionExpression typescript/factory node modifiers))
  (^js [node modifiers asterisk-token]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token))
  (^js [node modifiers asterisk-token name]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name))
  (^js [node modifiers asterisk-token name type-parameters]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-arrow-function
  (^js []
   (.createArrowFunction typescript/factory))
  (^js [modifiers]
   (.createArrowFunction typescript/factory modifiers))
  (^js [modifiers type-parameters]
   (.createArrowFunction typescript/factory modifiers type-parameters))
  (^js [modifiers type-parameters parameters]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters))
  (^js [modifiers type-parameters parameters type]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters type))
  (^js [modifiers type-parameters parameters type equals-greater-than-token]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters type equals-greater-than-token))
  (^js [modifiers type-parameters parameters type equals-greater-than-token body]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters type equals-greater-than-token body)))

(defn update-arrow-function
  (^js [node]
   (.updateArrowFunction typescript/factory node))
  (^js [node modifiers]
   (.updateArrowFunction typescript/factory node modifiers))
  (^js [node modifiers type-parameters]
   (.updateArrowFunction typescript/factory node modifiers type-parameters))
  (^js [node modifiers type-parameters parameters]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters))
  (^js [node modifiers type-parameters parameters type]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters type))
  (^js [node modifiers type-parameters parameters type equals-greater-than-token]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters type equals-greater-than-token))
  (^js [node modifiers type-parameters parameters type equals-greater-than-token body]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters type equals-greater-than-token body)))

(defn create-delete-expression
  ^js [expression]
  (.createDeleteExpression typescript/factory expression))

(defn update-delete-expression
  ^js [node expression]
  (.updateDeleteExpression typescript/factory node expression))

(defn create-type-of-expression
  ^js [expression]
  (.createTypeOfExpression typescript/factory expression))

(defn update-type-of-expression
  ^js [node expression]
  (.updateTypeOfExpression typescript/factory node expression))

(defn create-void-expression
  ^js [expression]
  (.createVoidExpression typescript/factory expression))

(defn update-void-expression
  ^js [node expression]
  (.updateVoidExpression typescript/factory node expression))

(defn create-await-expression
  ^js [expression]
  (.createAwaitExpression typescript/factory expression))

(defn update-await-expression
  ^js [node expression]
  (.updateAwaitExpression typescript/factory node expression))

(defn create-prefix-unary-expression
  ^js [operator operand]
  (.createPrefixUnaryExpression typescript/factory operator operand))

(defn update-prefix-unary-expression
  ^js [node operand]
  (.updatePrefixUnaryExpression typescript/factory node operand))

(defn create-postfix-unary-expression
  ^js [operand operator]
  (.createPostfixUnaryExpression typescript/factory operand operator))

(defn update-postfix-unary-expression
  ^js [node operand]
  (.updatePostfixUnaryExpression typescript/factory node operand))

(defn create-binary-expression
  ^js [left operator right]
  (.createBinaryExpression typescript/factory left operator right))

(defn update-binary-expression
  ^js [node left operator right]
  (.updateBinaryExpression typescript/factory node left operator right))

(defn create-conditional-expression
  (^js [condition]
   (.createConditionalExpression typescript/factory condition))
  (^js [condition question-token]
   (.createConditionalExpression typescript/factory condition question-token))
  (^js [condition question-token when-true]
   (.createConditionalExpression typescript/factory condition question-token when-true))
  (^js [condition question-token when-true colon-token]
   (.createConditionalExpression typescript/factory condition question-token when-true colon-token))
  (^js [condition question-token when-true colon-token when-false]
   (.createConditionalExpression typescript/factory condition question-token when-true colon-token when-false)))

(defn update-conditional-expression
  ^js [node condition question-token when-true colon-token when-false]
  (.updateConditionalExpression typescript/factory node condition question-token when-true colon-token when-false))

(defn create-template-expression
  ^js [head template-spans]
  (.createTemplateExpression typescript/factory head template-spans))

(defn update-template-expression
  ^js [node head template-spans]
  (.updateTemplateExpression typescript/factory node head template-spans))

(defn create-template-head
  (^js []
   (.createTemplateHead typescript/factory))
  (^js [text]
   (.createTemplateHead typescript/factory text))
  (^js [text raw-text]
   (.createTemplateHead typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateHead typescript/factory text raw-text template-flags)))

(defn create-template-middle
  (^js []
   (.createTemplateMiddle typescript/factory))
  (^js [text]
   (.createTemplateMiddle typescript/factory text))
  (^js [text raw-text]
   (.createTemplateMiddle typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateMiddle typescript/factory text raw-text template-flags)))

(defn create-template-tail
  (^js []
   (.createTemplateTail typescript/factory))
  (^js [text]
   (.createTemplateTail typescript/factory text))
  (^js [text raw-text]
   (.createTemplateTail typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateTail typescript/factory text raw-text template-flags)))

(defn create-no-substitution-template-literal
  (^js []
   (.createNoSubstitutionTemplateLiteral typescript/factory))
  (^js [text]
   (.createNoSubstitutionTemplateLiteral typescript/factory text))
  (^js [text raw-text]
   (.createNoSubstitutionTemplateLiteral typescript/factory text raw-text)))

(defn create-yield-expression
  (^js []
   (.createYieldExpression typescript/factory))
  (^js [asterisk-token]
   (.createYieldExpression typescript/factory asterisk-token))
  (^js [asterisk-token expression]
   (.createYieldExpression typescript/factory asterisk-token expression)))

(defn update-yield-expression
  (^js [node]
   (.updateYieldExpression typescript/factory node))
  (^js [node asterisk-token]
   (.updateYieldExpression typescript/factory node asterisk-token))
  (^js [node asterisk-token expression]
   (.updateYieldExpression typescript/factory node asterisk-token expression)))

(defn create-spread-element
  ^js [expression]
  (.createSpreadElement typescript/factory expression))

(defn update-spread-element
  ^js [node expression]
  (.updateSpreadElement typescript/factory node expression))

(defn create-class-expression
  (^js []
   (.createClassExpression typescript/factory))
  (^js [modifiers]
   (.createClassExpression typescript/factory modifiers))
  (^js [modifiers name]
   (.createClassExpression typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createClassExpression typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters heritage-clauses]
   (.createClassExpression typescript/factory modifiers name type-parameters heritage-clauses))
  (^js [modifiers name type-parameters heritage-clauses members]
   (.createClassExpression typescript/factory modifiers name type-parameters heritage-clauses members)))

(defn update-class-expression
  (^js [node]
   (.updateClassExpression typescript/factory node))
  (^js [node modifiers]
   (.updateClassExpression typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateClassExpression typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateClassExpression typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters heritage-clauses]
   (.updateClassExpression typescript/factory node modifiers name type-parameters heritage-clauses))
  (^js [node modifiers name type-parameters heritage-clauses members]
   (.updateClassExpression typescript/factory node modifiers name type-parameters heritage-clauses members)))

(defn create-omitted-expression
  ^js []
  (.createOmittedExpression typescript/factory))

(defn create-expression-with-type-arguments
  (^js [expression]
   (.createExpressionWithTypeArguments typescript/factory expression))
  (^js [expression type-arguments]
   (.createExpressionWithTypeArguments typescript/factory expression type-arguments)))

(defn update-expression-with-type-arguments
  (^js [node expression]
   (.updateExpressionWithTypeArguments typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateExpressionWithTypeArguments typescript/factory node expression type-arguments)))

(defn create-as-expression
  ^js [expression type]
  (.createAsExpression typescript/factory expression type))

(defn update-as-expression
  ^js [node expression type]
  (.updateAsExpression typescript/factory node expression type))

(defn create-non-null-expression
  ^js [expression]
  (.createNonNullExpression typescript/factory expression))

(defn update-non-null-expression
  ^js [node expression]
  (.updateNonNullExpression typescript/factory node expression))

(defn create-non-null-chain
  ^js [expression]
  (.createNonNullChain typescript/factory expression))

(defn update-non-null-chain
  ^js [node expression]
  (.updateNonNullChain typescript/factory node expression))

(defn create-meta-property
  ^js [keyword-token name]
  (.createMetaProperty typescript/factory keyword-token name))

(defn update-meta-property
  ^js [node name]
  (.updateMetaProperty typescript/factory node name))

(defn create-satisfies-expression
  ^js [expression type]
  (.createSatisfiesExpression typescript/factory expression type))

(defn update-satisfies-expression
  ^js [node expression type]
  (.updateSatisfiesExpression typescript/factory node expression type))

(defn create-template-span
  ^js [expression literal]
  (.createTemplateSpan typescript/factory expression literal))

(defn update-template-span
  ^js [node expression literal]
  (.updateTemplateSpan typescript/factory node expression literal))

(defn create-semicolon-class-element
  ^js []
  (.createSemicolonClassElement typescript/factory))

(defn create-block
  (^js [statements]
   (.createBlock typescript/factory statements))
  (^js [statements multi-line?]
   (.createBlock typescript/factory statements multi-line?)))

(defn update-block
  ^js [node statements]
  (.updateBlock typescript/factory node statements))

(defn create-variable-statement
  (^js []
   (.createVariableStatement typescript/factory))
  (^js [modifiers]
   (.createVariableStatement typescript/factory modifiers))
  (^js [modifiers declaration-list]
   (.createVariableStatement typescript/factory modifiers declaration-list)))

(defn update-variable-statement
  (^js [node]
   (.updateVariableStatement typescript/factory node))
  (^js [node modifiers]
   (.updateVariableStatement typescript/factory node modifiers))
  (^js [node modifiers declaration-list]
   (.updateVariableStatement typescript/factory node modifiers declaration-list)))

(defn create-empty-statement
  ^js []
  (.createEmptyStatement typescript/factory))

(defn create-expression-statement
  ^js [expression]
  (.createExpressionStatement typescript/factory expression))

(defn update-expression-statement
  ^js [node expression]
  (.updateExpressionStatement typescript/factory node expression))

(defn create-if-statement
  (^js [expression then-statement]
   (.createIfStatement typescript/factory expression then-statement))
  (^js [expression then-statement else-statement]
   (.createIfStatement typescript/factory expression then-statement else-statement)))

(defn update-if-statement
  (^js [node expression then-statement]
   (.updateIfStatement typescript/factory node expression then-statement))
  (^js [node expression then-statement else-statement]
   (.updateIfStatement typescript/factory node expression then-statement else-statement)))

(defn create-do-statement
  ^js [statement expression]
  (.createDoStatement typescript/factory statement expression))

(defn update-do-statement
  ^js [node statement expression]
  (.updateDoStatement typescript/factory node statement expression))

(defn create-while-statement
  ^js [expression statement]
  (.createWhileStatement typescript/factory expression statement))

(defn update-while-statement
  ^js [node expression statement]
  (.updateWhileStatement typescript/factory node expression statement))

(defn create-for-statement
  (^js []
   (.createForStatement typescript/factory))
  (^js [initializer]
   (.createForStatement typescript/factory initializer))
  (^js [initializer condition]
   (.createForStatement typescript/factory initializer condition))
  (^js [initializer condition incrementor]
   (.createForStatement typescript/factory initializer condition incrementor))
  (^js [initializer condition incrementor statement]
   (.createForStatement typescript/factory initializer condition incrementor statement)))

(defn update-for-statement
  (^js [node]
   (.updateForStatement typescript/factory node))
  (^js [node initializer]
   (.updateForStatement typescript/factory node initializer))
  (^js [node initializer condition]
   (.updateForStatement typescript/factory node initializer condition))
  (^js [node initializer condition incrementor]
   (.updateForStatement typescript/factory node initializer condition incrementor))
  (^js [node initializer condition incrementor statement]
   (.updateForStatement typescript/factory node initializer condition incrementor statement)))

(defn create-for-in-statement
  ^js [initializer expression statement]
  (.createForInStatement typescript/factory initializer expression statement))

(defn update-for-in-statement
  ^js [node initializer expression statement]
  (.updateForInStatement typescript/factory node initializer expression statement))

(defn create-for-of-statement
  (^js []
   (.createForOfStatement typescript/factory))
  (^js [await-modifier]
   (.createForOfStatement typescript/factory await-modifier))
  (^js [await-modifier initializer]
   (.createForOfStatement typescript/factory await-modifier initializer))
  (^js [await-modifier initializer expression]
   (.createForOfStatement typescript/factory await-modifier initializer expression))
  (^js [await-modifier initializer expression statement]
   (.createForOfStatement typescript/factory await-modifier initializer expression statement)))

(defn update-for-of-statement
  (^js [node]
   (.updateForOfStatement typescript/factory node))
  (^js [node await-modifier]
   (.updateForOfStatement typescript/factory node await-modifier))
  (^js [node await-modifier initializer]
   (.updateForOfStatement typescript/factory node await-modifier initializer))
  (^js [node await-modifier initializer expression]
   (.updateForOfStatement typescript/factory node await-modifier initializer expression))
  (^js [node await-modifier initializer expression statement]
   (.updateForOfStatement typescript/factory node await-modifier initializer expression statement)))

(defn create-continue-statement
  (^js []
   (.createContinueStatement typescript/factory))
  (^js [label]
   (.createContinueStatement typescript/factory label)))

(defn update-continue-statement
  (^js [node]
   (.updateContinueStatement typescript/factory node))
  (^js [node label]
   (.updateContinueStatement typescript/factory node label)))

(defn create-break-statement
  (^js []
   (.createBreakStatement typescript/factory))
  (^js [label]
   (.createBreakStatement typescript/factory label)))

(defn update-break-statement
  (^js [node]
   (.updateBreakStatement typescript/factory node))
  (^js [node label]
   (.updateBreakStatement typescript/factory node label)))

(defn create-return-statement
  (^js []
   (.createReturnStatement typescript/factory))
  (^js [expression]
   (.createReturnStatement typescript/factory expression)))

(defn update-return-statement
  (^js [node]
   (.updateReturnStatement typescript/factory node))
  (^js [node expression]
   (.updateReturnStatement typescript/factory node expression)))

(defn create-with-statement
  ^js [expression statement]
  (.createWithStatement typescript/factory expression statement))

(defn update-with-statement
  ^js [node expression statement]
  (.updateWithStatement typescript/factory node expression statement))

(defn create-switch-statement
  ^js [expression case-block]
  (.createSwitchStatement typescript/factory expression case-block))

(defn update-switch-statement
  ^js [node expression case-block]
  (.updateSwitchStatement typescript/factory node expression case-block))

(defn create-labeled-statement
  ^js [label statement]
  (.createLabeledStatement typescript/factory label statement))

(defn update-labeled-statement
  ^js [node label statement]
  (.updateLabeledStatement typescript/factory node label statement))

(defn create-throw-statement
  ^js [expression]
  (.createThrowStatement typescript/factory expression))

(defn update-throw-statement
  ^js [node expression]
  (.updateThrowStatement typescript/factory node expression))

(defn create-try-statement
  (^js [try-block]
   (.createTryStatement typescript/factory try-block))
  (^js [try-block catch-clause]
   (.createTryStatement typescript/factory try-block catch-clause))
  (^js [try-block catch-clause finally-block]
   (.createTryStatement typescript/factory try-block catch-clause finally-block)))

(defn update-try-statement
  (^js [node try-block]
   (.updateTryStatement typescript/factory node try-block))
  (^js [node try-block catch-clause]
   (.updateTryStatement typescript/factory node try-block catch-clause))
  (^js [node try-block catch-clause finally-block]
   (.updateTryStatement typescript/factory node try-block catch-clause finally-block)))

(defn create-debugger-statement
  ^js []
  (.createDebuggerStatement typescript/factory))

(defn create-variable-declaration
  (^js [name]
   (.createVariableDeclaration typescript/factory name))
  (^js [name exclamation-token]
   (.createVariableDeclaration typescript/factory name exclamation-token))
  (^js [name exclamation-token type]
   (.createVariableDeclaration typescript/factory name exclamation-token type))
  (^js [name exclamation-token type initializer]
   (.createVariableDeclaration typescript/factory name exclamation-token type initializer)))

(defn update-variable-declaration
  (^js [node name]
   (.updateVariableDeclaration typescript/factory node name))
  (^js [node name exclamation-token]
   (.updateVariableDeclaration typescript/factory node name exclamation-token))
  (^js [node name exclamation-token type]
   (.updateVariableDeclaration typescript/factory node name exclamation-token type))
  (^js [node name exclamation-token type initializer]
   (.updateVariableDeclaration typescript/factory node name exclamation-token type initializer)))

(defn create-variable-declaration-list
  (^js [declarations]
   (.createVariableDeclarationList typescript/factory declarations))
  (^js [declarations flags]
   (.createVariableDeclarationList typescript/factory declarations flags)))

(defn update-variable-declaration-list
  ^js [node declarations]
  (.updateVariableDeclarationList typescript/factory node declarations))

(defn create-function-declaration
  (^js []
   (.createFunctionDeclaration typescript/factory))
  (^js [modifiers]
   (.createFunctionDeclaration typescript/factory modifiers))
  (^js [modifiers asterisk-token]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token))
  (^js [modifiers asterisk-token name]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name))
  (^js [modifiers asterisk-token name type-parameters]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters))
  (^js [modifiers asterisk-token name type-parameters parameters]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters parameters))
  (^js [modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters parameters type))
  (^js [modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-declaration
  (^js [node]
   (.updateFunctionDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateFunctionDeclaration typescript/factory node modifiers))
  (^js [node modifiers asterisk-token]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token))
  (^js [node modifiers asterisk-token name]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name))
  (^js [node modifiers asterisk-token name type-parameters]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-class-declaration
  (^js []
   (.createClassDeclaration typescript/factory))
  (^js [modifiers]
   (.createClassDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createClassDeclaration typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createClassDeclaration typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters heritage-clauses]
   (.createClassDeclaration typescript/factory modifiers name type-parameters heritage-clauses))
  (^js [modifiers name type-parameters heritage-clauses members]
   (.createClassDeclaration typescript/factory modifiers name type-parameters heritage-clauses members)))

(defn update-class-declaration
  (^js [node]
   (.updateClassDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateClassDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateClassDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateClassDeclaration typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters heritage-clauses]
   (.updateClassDeclaration typescript/factory node modifiers name type-parameters heritage-clauses))
  (^js [node modifiers name type-parameters heritage-clauses members]
   (.updateClassDeclaration typescript/factory node modifiers name type-parameters heritage-clauses members)))

(defn create-interface-declaration
  (^js []
   (.createInterfaceDeclaration typescript/factory))
  (^js [modifiers]
   (.createInterfaceDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createInterfaceDeclaration typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createInterfaceDeclaration typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters heritage-clauses]
   (.createInterfaceDeclaration typescript/factory modifiers name type-parameters heritage-clauses))
  (^js [modifiers name type-parameters heritage-clauses members]
   (.createInterfaceDeclaration typescript/factory modifiers name type-parameters heritage-clauses members)))

(defn update-interface-declaration
  (^js [node]
   (.updateInterfaceDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateInterfaceDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateInterfaceDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateInterfaceDeclaration typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters heritage-clauses]
   (.updateInterfaceDeclaration typescript/factory node modifiers name type-parameters heritage-clauses))
  (^js [node modifiers name type-parameters heritage-clauses members]
   (.updateInterfaceDeclaration typescript/factory node modifiers name type-parameters heritage-clauses members)))

(defn create-type-alias-declaration
  (^js []
   (.createTypeAliasDeclaration typescript/factory))
  (^js [modifiers]
   (.createTypeAliasDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createTypeAliasDeclaration typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createTypeAliasDeclaration typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters type]
   (.createTypeAliasDeclaration typescript/factory modifiers name type-parameters type)))

(defn update-type-alias-declaration
  (^js [node]
   (.updateTypeAliasDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateTypeAliasDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateTypeAliasDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateTypeAliasDeclaration typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters type]
   (.updateTypeAliasDeclaration typescript/factory node modifiers name type-parameters type)))

(defn create-enum-declaration
  (^js []
   (.createEnumDeclaration typescript/factory))
  (^js [modifiers]
   (.createEnumDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createEnumDeclaration typescript/factory modifiers name))
  (^js [modifiers name members]
   (.createEnumDeclaration typescript/factory modifiers name members)))

(defn update-enum-declaration
  (^js [node]
   (.updateEnumDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateEnumDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateEnumDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name members]
   (.updateEnumDeclaration typescript/factory node modifiers name members)))

(defn create-module-declaration
  (^js []
   (.createModuleDeclaration typescript/factory))
  (^js [modifiers]
   (.createModuleDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createModuleDeclaration typescript/factory modifiers name))
  (^js [modifiers name body]
   (.createModuleDeclaration typescript/factory modifiers name body))
  (^js [modifiers name body flags]
   (.createModuleDeclaration typescript/factory modifiers name body flags)))

(defn update-module-declaration
  (^js [node]
   (.updateModuleDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateModuleDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateModuleDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name body]
   (.updateModuleDeclaration typescript/factory node modifiers name body)))

(defn create-module-block
  ^js [statements]
  (.createModuleBlock typescript/factory statements))

(defn update-module-block
  ^js [node statements]
  (.updateModuleBlock typescript/factory node statements))

(defn create-case-block
  ^js [clauses]
  (.createCaseBlock typescript/factory clauses))

(defn update-case-block
  ^js [node clauses]
  (.updateCaseBlock typescript/factory node clauses))

(defn create-namespace-export-declaration
  ^js [name]
  (.createNamespaceExportDeclaration typescript/factory name))

(defn update-namespace-export-declaration
  ^js [node name]
  (.updateNamespaceExportDeclaration typescript/factory node name))

(defn create-import-equals-declaration
  (^js []
   (.createImportEqualsDeclaration typescript/factory))
  (^js [modifiers]
   (.createImportEqualsDeclaration typescript/factory modifiers))
  (^js [modifiers type-only?]
   (.createImportEqualsDeclaration typescript/factory modifiers type-only?))
  (^js [modifiers type-only? name]
   (.createImportEqualsDeclaration typescript/factory modifiers type-only? name))
  (^js [modifiers type-only? name module-reference]
   (.createImportEqualsDeclaration typescript/factory modifiers type-only? name module-reference)))

(defn update-import-equals-declaration
  (^js [node]
   (.updateImportEqualsDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateImportEqualsDeclaration typescript/factory node modifiers))
  (^js [node modifiers type-only?]
   (.updateImportEqualsDeclaration typescript/factory node modifiers type-only?))
  (^js [node modifiers type-only? name]
   (.updateImportEqualsDeclaration typescript/factory node modifiers type-only? name))
  (^js [node modifiers type-only? name module-reference]
   (.updateImportEqualsDeclaration typescript/factory node modifiers type-only? name module-reference)))

(defn create-import-declaration
  (^js []
   (.createImportDeclaration typescript/factory))
  (^js [modifiers]
   (.createImportDeclaration typescript/factory modifiers))
  (^js [modifiers import-clause]
   (.createImportDeclaration typescript/factory modifiers import-clause))
  (^js [modifiers import-clause module-specifier]
   (.createImportDeclaration typescript/factory modifiers import-clause module-specifier))
  (^js [modifiers import-clause module-specifier assert-clause]
   (.createImportDeclaration typescript/factory modifiers import-clause module-specifier assert-clause)))

(defn update-import-declaration
  (^js [node]
   (.updateImportDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateImportDeclaration typescript/factory node modifiers))
  (^js [node modifiers import-clause]
   (.updateImportDeclaration typescript/factory node modifiers import-clause))
  (^js [node modifiers import-clause module-specifier]
   (.updateImportDeclaration typescript/factory node modifiers import-clause module-specifier))
  (^js [node modifiers import-clause module-specifier assert-clause]
   (.updateImportDeclaration typescript/factory node modifiers import-clause module-specifier assert-clause)))

(defn create-import-clause
  (^js [type-only?]
   (.createImportClause typescript/factory type-only?))
  (^js [type-only? name]
   (.createImportClause typescript/factory type-only? name))
  (^js [type-only? name named-bindings]
   (.createImportClause typescript/factory type-only? name named-bindings)))

(defn update-import-clause
  (^js [node type-only?]
   (.updateImportClause typescript/factory node type-only?))
  (^js [node type-only? name]
   (.updateImportClause typescript/factory node type-only? name))
  (^js [node type-only? name named-bindings]
   (.updateImportClause typescript/factory node type-only? name named-bindings)))

(defn create-assert-clause
  (^js [elements]
   (.createAssertClause typescript/factory elements))
  (^js [elements multi-line?]
   (.createAssertClause typescript/factory elements multi-line?)))

(defn update-assert-clause
  (^js [node elements]
   (.updateAssertClause typescript/factory node elements))
  (^js [node elements multi-line?]
   (.updateAssertClause typescript/factory node elements multi-line?)))

(defn create-assert-entry
  ^js [name value]
  (.createAssertEntry typescript/factory name value))

(defn update-assert-entry
  ^js [node name value]
  (.updateAssertEntry typescript/factory node name value))

(defn create-import-type-assertion-container
  (^js [clause]
   (.createImportTypeAssertionContainer typescript/factory clause))
  (^js [clause multi-line?]
   (.createImportTypeAssertionContainer typescript/factory clause multi-line?)))

(defn update-import-type-assertion-container
  (^js [node clause]
   (.updateImportTypeAssertionContainer typescript/factory node clause))
  (^js [node clause multi-line?]
   (.updateImportTypeAssertionContainer typescript/factory node clause multi-line?)))

(defn create-namespace-import
  ^js [name]
  (.createNamespaceImport typescript/factory name))

(defn update-namespace-import
  ^js [node name]
  (.updateNamespaceImport typescript/factory node name))

(defn create-namespace-export
  ^js [name]
  (.createNamespaceExport typescript/factory name))

(defn update-namespace-export
  ^js [node name]
  (.updateNamespaceExport typescript/factory node name))

(defn create-named-imports
  ^js [elements]
  (.createNamedImports typescript/factory elements))

(defn update-named-imports
  ^js [node elements]
  (.updateNamedImports typescript/factory node elements))

(defn create-import-specifier
  (^js [type-only?]
   (.createImportSpecifier typescript/factory type-only?))
  (^js [type-only? property-name]
   (.createImportSpecifier typescript/factory type-only? property-name))
  (^js [type-only? property-name name]
   (.createImportSpecifier typescript/factory type-only? property-name name)))

(defn update-import-specifier
  (^js [node type-only?]
   (.updateImportSpecifier typescript/factory node type-only?))
  (^js [node type-only? property-name]
   (.updateImportSpecifier typescript/factory node type-only? property-name))
  (^js [node type-only? property-name name]
   (.updateImportSpecifier typescript/factory node type-only? property-name name)))

(defn create-export-assignment
  (^js []
   (.createExportAssignment typescript/factory))
  (^js [modifiers]
   (.createExportAssignment typescript/factory modifiers))
  (^js [modifiers export-equals?]
   (.createExportAssignment typescript/factory modifiers export-equals?))
  (^js [modifiers export-equals? expression]
   (.createExportAssignment typescript/factory modifiers export-equals? expression)))

(defn update-export-assignment
  (^js [node]
   (.updateExportAssignment typescript/factory node))
  (^js [node modifiers]
   (.updateExportAssignment typescript/factory node modifiers))
  (^js [node modifiers expression]
   (.updateExportAssignment typescript/factory node modifiers expression)))

(defn create-export-declaration
  (^js []
   (.createExportDeclaration typescript/factory))
  (^js [modifiers]
   (.createExportDeclaration typescript/factory modifiers))
  (^js [modifiers type-only?]
   (.createExportDeclaration typescript/factory modifiers type-only?))
  (^js [modifiers type-only? export-clause]
   (.createExportDeclaration typescript/factory modifiers type-only? export-clause))
  (^js [modifiers type-only? export-clause module-specifier]
   (.createExportDeclaration typescript/factory modifiers type-only? export-clause module-specifier))
  (^js [modifiers type-only? export-clause module-specifier assert-clause]
   (.createExportDeclaration typescript/factory modifiers type-only? export-clause module-specifier assert-clause)))

(defn update-export-declaration
  (^js [node]
   (.updateExportDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateExportDeclaration typescript/factory node modifiers))
  (^js [node modifiers type-only?]
   (.updateExportDeclaration typescript/factory node modifiers type-only?))
  (^js [node modifiers type-only? export-clause]
   (.updateExportDeclaration typescript/factory node modifiers type-only? export-clause))
  (^js [node modifiers type-only? export-clause module-specifier]
   (.updateExportDeclaration typescript/factory node modifiers type-only? export-clause module-specifier))
  (^js [node modifiers type-only? export-clause module-specifier assert-clause]
   (.updateExportDeclaration typescript/factory node modifiers type-only? export-clause module-specifier assert-clause)))

(defn create-named-exports
  ^js [elements]
  (.createNamedExports typescript/factory elements))

(defn update-named-exports
  ^js [node elements]
  (.updateNamedExports typescript/factory node elements))

(defn create-export-specifier
  (^js [type-only?]
   (.createExportSpecifier typescript/factory type-only?))
  (^js [type-only? property-name]
   (.createExportSpecifier typescript/factory type-only? property-name))
  (^js [type-only? property-name name]
   (.createExportSpecifier typescript/factory type-only? property-name name)))

(defn update-export-specifier
  (^js [node type-only?]
   (.updateExportSpecifier typescript/factory node type-only?))
  (^js [node type-only? property-name]
   (.updateExportSpecifier typescript/factory node type-only? property-name))
  (^js [node type-only? property-name name]
   (.updateExportSpecifier typescript/factory node type-only? property-name name)))

(defn create-external-module-reference
  ^js [expression]
  (.createExternalModuleReference typescript/factory expression))

(defn update-external-module-reference
  ^js [node expression]
  (.updateExternalModuleReference typescript/factory node expression))

(defn create-js-doc-all-type
  ^js []
  (.createJSDocAllType typescript/factory))

(defn create-js-doc-unknown-type
  ^js []
  (.createJSDocUnknownType typescript/factory))

(defn create-js-doc-non-nullable-type
  (^js [type]
   (.createJSDocNonNullableType typescript/factory type))
  (^js [type postfix?]
   (.createJSDocNonNullableType typescript/factory type postfix?)))

(defn update-js-doc-non-nullable-type
  ^js [node type]
  (.updateJSDocNonNullableType typescript/factory node type))

(defn create-js-doc-nullable-type
  (^js [type]
   (.createJSDocNullableType typescript/factory type))
  (^js [type postfix?]
   (.createJSDocNullableType typescript/factory type postfix?)))

(defn update-js-doc-nullable-type
  ^js [node type]
  (.updateJSDocNullableType typescript/factory node type))

(defn create-js-doc-optional-type
  ^js [type]
  (.createJSDocOptionalType typescript/factory type))

(defn update-js-doc-optional-type
  ^js [node type]
  (.updateJSDocOptionalType typescript/factory node type))

(defn create-js-doc-function-type
  (^js [parameters]
   (.createJSDocFunctionType typescript/factory parameters))
  (^js [parameters type]
   (.createJSDocFunctionType typescript/factory parameters type)))

(defn update-js-doc-function-type
  (^js [node parameters]
   (.updateJSDocFunctionType typescript/factory node parameters))
  (^js [node parameters type]
   (.updateJSDocFunctionType typescript/factory node parameters type)))

(defn create-js-doc-variadic-type
  ^js [type]
  (.createJSDocVariadicType typescript/factory type))

(defn update-js-doc-variadic-type
  ^js [node type]
  (.updateJSDocVariadicType typescript/factory node type))

(defn create-js-doc-namepath-type
  ^js [type]
  (.createJSDocNamepathType typescript/factory type))

(defn update-js-doc-namepath-type
  ^js [node type]
  (.updateJSDocNamepathType typescript/factory node type))

(defn create-js-doc-type-expression
  ^js [type]
  (.createJSDocTypeExpression typescript/factory type))

(defn update-js-doc-type-expression
  ^js [node type]
  (.updateJSDocTypeExpression typescript/factory node type))

(defn create-js-doc-name-reference
  ^js [name]
  (.createJSDocNameReference typescript/factory name))

(defn update-js-doc-name-reference
  ^js [node name]
  (.updateJSDocNameReference typescript/factory node name))

(defn create-js-doc-member-name
  ^js [left right]
  (.createJSDocMemberName typescript/factory left right))

(defn update-js-doc-member-name
  ^js [node left right]
  (.updateJSDocMemberName typescript/factory node left right))

(defn create-js-doc-link
  (^js []
   (.createJSDocLink typescript/factory))
  (^js [name]
   (.createJSDocLink typescript/factory name))
  (^js [name text]
   (.createJSDocLink typescript/factory name text)))

(defn update-js-doc-link
  (^js [node]
   (.updateJSDocLink typescript/factory node))
  (^js [node name]
   (.updateJSDocLink typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLink typescript/factory node name text)))

(defn create-js-doc-link-code
  (^js []
   (.createJSDocLinkCode typescript/factory))
  (^js [name]
   (.createJSDocLinkCode typescript/factory name))
  (^js [name text]
   (.createJSDocLinkCode typescript/factory name text)))

(defn update-js-doc-link-code
  (^js [node]
   (.updateJSDocLinkCode typescript/factory node))
  (^js [node name]
   (.updateJSDocLinkCode typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLinkCode typescript/factory node name text)))

(defn create-js-doc-link-plain
  (^js []
   (.createJSDocLinkPlain typescript/factory))
  (^js [name]
   (.createJSDocLinkPlain typescript/factory name))
  (^js [name text]
   (.createJSDocLinkPlain typescript/factory name text)))

(defn update-js-doc-link-plain
  (^js [node]
   (.updateJSDocLinkPlain typescript/factory node))
  (^js [node name]
   (.updateJSDocLinkPlain typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLinkPlain typescript/factory node name text)))

(defn create-js-doc-type-literal
  (^js []
   (.createJSDocTypeLiteral typescript/factory))
  (^js [js-doc-property-tags]
   (.createJSDocTypeLiteral typescript/factory js-doc-property-tags))
  (^js [js-doc-property-tags array-type?]
   (.createJSDocTypeLiteral typescript/factory js-doc-property-tags array-type?)))

(defn update-js-doc-type-literal
  (^js [node]
   (.updateJSDocTypeLiteral typescript/factory node))
  (^js [node js-doc-property-tags]
   (.updateJSDocTypeLiteral typescript/factory node js-doc-property-tags))
  (^js [node js-doc-property-tags array-type?]
   (.updateJSDocTypeLiteral typescript/factory node js-doc-property-tags array-type?)))

(defn create-js-doc-signature
  (^js []
   (.createJSDocSignature typescript/factory))
  (^js [type-parameters]
   (.createJSDocSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createJSDocSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createJSDocSignature typescript/factory type-parameters parameters type)))

(defn update-js-doc-signature
  (^js [node]
   (.updateJSDocSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateJSDocSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateJSDocSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateJSDocSignature typescript/factory node type-parameters parameters type)))

(defn create-js-doc-template-tag
  (^js []
   (.createJSDocTemplateTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTemplateTag typescript/factory tag-name))
  (^js [tag-name constraint]
   (.createJSDocTemplateTag typescript/factory tag-name constraint))
  (^js [tag-name constraint type-parameters]
   (.createJSDocTemplateTag typescript/factory tag-name constraint type-parameters))
  (^js [tag-name constraint type-parameters comment]
   (.createJSDocTemplateTag typescript/factory tag-name constraint type-parameters comment)))

(defn update-js-doc-template-tag
  (^js [node]
   (.updateJSDocTemplateTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTemplateTag typescript/factory node tag-name))
  (^js [node tag-name constraint]
   (.updateJSDocTemplateTag typescript/factory node tag-name constraint))
  (^js [node tag-name constraint type-parameters]
   (.updateJSDocTemplateTag typescript/factory node tag-name constraint type-parameters))
  (^js [node tag-name constraint type-parameters comment]
   (.updateJSDocTemplateTag typescript/factory node tag-name constraint type-parameters comment)))

(defn create-js-doc-typedef-tag
  (^js []
   (.createJSDocTypedefTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTypedefTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocTypedefTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression full-name]
   (.createJSDocTypedefTag typescript/factory tag-name type-expression full-name))
  (^js [tag-name type-expression full-name comment]
   (.createJSDocTypedefTag typescript/factory tag-name type-expression full-name comment)))

(defn update-js-doc-typedef-tag
  (^js [node]
   (.updateJSDocTypedefTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTypedefTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocTypedefTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression full-name]
   (.updateJSDocTypedefTag typescript/factory node tag-name type-expression full-name))
  (^js [node tag-name type-expression full-name comment]
   (.updateJSDocTypedefTag typescript/factory node tag-name type-expression full-name comment)))

(defn create-js-doc-parameter-tag
  (^js []
   (.createJSDocParameterTag typescript/factory))
  (^js [tag-name]
   (.createJSDocParameterTag typescript/factory tag-name))
  (^js [tag-name name]
   (.createJSDocParameterTag typescript/factory tag-name name))
  (^js [tag-name name bracketed?]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed?))
  (^js [tag-name name bracketed? type-expression]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed? type-expression))
  (^js [tag-name name bracketed? type-expression name-first?]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed? type-expression name-first?))
  (^js [tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed? type-expression name-first? comment)))

(defn update-js-doc-parameter-tag
  (^js [node]
   (.updateJSDocParameterTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocParameterTag typescript/factory node tag-name))
  (^js [node tag-name name]
   (.updateJSDocParameterTag typescript/factory node tag-name name))
  (^js [node tag-name name bracketed?]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed?))
  (^js [node tag-name name bracketed? type-expression]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed? type-expression))
  (^js [node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed? type-expression name-first?))
  (^js [node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-property-tag
  (^js []
   (.createJSDocPropertyTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPropertyTag typescript/factory tag-name))
  (^js [tag-name name]
   (.createJSDocPropertyTag typescript/factory tag-name name))
  (^js [tag-name name bracketed?]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed?))
  (^js [tag-name name bracketed? type-expression]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed? type-expression))
  (^js [tag-name name bracketed? type-expression name-first?]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed? type-expression name-first?))
  (^js [tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed? type-expression name-first? comment)))

(defn update-js-doc-property-tag
  (^js [node]
   (.updateJSDocPropertyTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPropertyTag typescript/factory node tag-name))
  (^js [node tag-name name]
   (.updateJSDocPropertyTag typescript/factory node tag-name name))
  (^js [node tag-name name bracketed?]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed?))
  (^js [node tag-name name bracketed? type-expression]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed? type-expression))
  (^js [node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed? type-expression name-first?))
  (^js [node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-type-tag
  (^js []
   (.createJSDocTypeTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTypeTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocTypeTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocTypeTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-type-tag
  (^js [node]
   (.updateJSDocTypeTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTypeTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocTypeTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocTypeTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-see-tag
  (^js []
   (.createJSDocSeeTag typescript/factory))
  (^js [tag-name]
   (.createJSDocSeeTag typescript/factory tag-name))
  (^js [tag-name name-expression]
   (.createJSDocSeeTag typescript/factory tag-name name-expression))
  (^js [tag-name name-expression comment]
   (.createJSDocSeeTag typescript/factory tag-name name-expression comment)))

(defn update-js-doc-see-tag
  (^js [node]
   (.updateJSDocSeeTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocSeeTag typescript/factory node tag-name))
  (^js [node tag-name name-expression]
   (.updateJSDocSeeTag typescript/factory node tag-name name-expression))
  (^js [node tag-name name-expression comment]
   (.updateJSDocSeeTag typescript/factory node tag-name name-expression comment)))

(defn create-js-doc-return-tag
  (^js []
   (.createJSDocReturnTag typescript/factory))
  (^js [tag-name]
   (.createJSDocReturnTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocReturnTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocReturnTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-return-tag
  (^js [node]
   (.updateJSDocReturnTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocReturnTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocReturnTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocReturnTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-this-tag
  (^js []
   (.createJSDocThisTag typescript/factory))
  (^js [tag-name]
   (.createJSDocThisTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocThisTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocThisTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-this-tag
  (^js [node]
   (.updateJSDocThisTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocThisTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocThisTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocThisTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-enum-tag
  (^js []
   (.createJSDocEnumTag typescript/factory))
  (^js [tag-name]
   (.createJSDocEnumTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocEnumTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocEnumTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-enum-tag
  (^js [node]
   (.updateJSDocEnumTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocEnumTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocEnumTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocEnumTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-callback-tag
  (^js []
   (.createJSDocCallbackTag typescript/factory))
  (^js [tag-name]
   (.createJSDocCallbackTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocCallbackTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression full-name]
   (.createJSDocCallbackTag typescript/factory tag-name type-expression full-name))
  (^js [tag-name type-expression full-name comment]
   (.createJSDocCallbackTag typescript/factory tag-name type-expression full-name comment)))

(defn update-js-doc-callback-tag
  (^js [node]
   (.updateJSDocCallbackTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocCallbackTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocCallbackTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression full-name]
   (.updateJSDocCallbackTag typescript/factory node tag-name type-expression full-name))
  (^js [node tag-name type-expression full-name comment]
   (.updateJSDocCallbackTag typescript/factory node tag-name type-expression full-name comment)))

(defn create-js-doc-overload-tag
  (^js []
   (.createJSDocOverloadTag typescript/factory))
  (^js [tag-name]
   (.createJSDocOverloadTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocOverloadTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocOverloadTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-overload-tag
  (^js [node]
   (.updateJSDocOverloadTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocOverloadTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocOverloadTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocOverloadTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-augments-tag
  (^js []
   (.createJSDocAugmentsTag typescript/factory))
  (^js [tag-name]
   (.createJSDocAugmentsTag typescript/factory tag-name))
  (^js [tag-name class-name]
   (.createJSDocAugmentsTag typescript/factory tag-name class-name))
  (^js [tag-name class-name comment]
   (.createJSDocAugmentsTag typescript/factory tag-name class-name comment)))

(defn update-js-doc-augments-tag
  (^js [node]
   (.updateJSDocAugmentsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocAugmentsTag typescript/factory node tag-name))
  (^js [node tag-name class-name]
   (.updateJSDocAugmentsTag typescript/factory node tag-name class-name))
  (^js [node tag-name class-name comment]
   (.updateJSDocAugmentsTag typescript/factory node tag-name class-name comment)))

(defn create-js-doc-implements-tag
  (^js []
   (.createJSDocImplementsTag typescript/factory))
  (^js [tag-name]
   (.createJSDocImplementsTag typescript/factory tag-name))
  (^js [tag-name class-name]
   (.createJSDocImplementsTag typescript/factory tag-name class-name))
  (^js [tag-name class-name comment]
   (.createJSDocImplementsTag typescript/factory tag-name class-name comment)))

(defn update-js-doc-implements-tag
  (^js [node]
   (.updateJSDocImplementsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocImplementsTag typescript/factory node tag-name))
  (^js [node tag-name class-name]
   (.updateJSDocImplementsTag typescript/factory node tag-name class-name))
  (^js [node tag-name class-name comment]
   (.updateJSDocImplementsTag typescript/factory node tag-name class-name comment)))

(defn create-js-doc-author-tag
  (^js []
   (.createJSDocAuthorTag typescript/factory))
  (^js [tag-name]
   (.createJSDocAuthorTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocAuthorTag typescript/factory tag-name comment)))

(defn update-js-doc-author-tag
  (^js [node]
   (.updateJSDocAuthorTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocAuthorTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocAuthorTag typescript/factory node tag-name comment)))

(defn create-js-doc-class-tag
  (^js []
   (.createJSDocClassTag typescript/factory))
  (^js [tag-name]
   (.createJSDocClassTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocClassTag typescript/factory tag-name comment)))

(defn update-js-doc-class-tag
  (^js [node]
   (.updateJSDocClassTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocClassTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocClassTag typescript/factory node tag-name comment)))

(defn create-js-doc-public-tag
  (^js []
   (.createJSDocPublicTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPublicTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocPublicTag typescript/factory tag-name comment)))

(defn update-js-doc-public-tag
  (^js [node]
   (.updateJSDocPublicTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPublicTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocPublicTag typescript/factory node tag-name comment)))

(defn create-js-doc-private-tag
  (^js []
   (.createJSDocPrivateTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPrivateTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocPrivateTag typescript/factory tag-name comment)))

(defn update-js-doc-private-tag
  (^js [node]
   (.updateJSDocPrivateTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPrivateTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocPrivateTag typescript/factory node tag-name comment)))

(defn create-js-doc-protected-tag
  (^js []
   (.createJSDocProtectedTag typescript/factory))
  (^js [tag-name]
   (.createJSDocProtectedTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocProtectedTag typescript/factory tag-name comment)))

(defn update-js-doc-protected-tag
  (^js [node]
   (.updateJSDocProtectedTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocProtectedTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocProtectedTag typescript/factory node tag-name comment)))

(defn create-js-doc-readonly-tag
  (^js []
   (.createJSDocReadonlyTag typescript/factory))
  (^js [tag-name]
   (.createJSDocReadonlyTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocReadonlyTag typescript/factory tag-name comment)))

(defn update-js-doc-readonly-tag
  (^js [node]
   (.updateJSDocReadonlyTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocReadonlyTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocReadonlyTag typescript/factory node tag-name comment)))

(defn create-js-doc-unknown-tag
  (^js [tag-name]
   (.createJSDocUnknownTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocUnknownTag typescript/factory tag-name comment)))

(defn update-js-doc-unknown-tag
  (^js [node tag-name]
   (.updateJSDocUnknownTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocUnknownTag typescript/factory node tag-name comment)))

(defn create-js-doc-deprecated-tag
  (^js []
   (.createJSDocDeprecatedTag typescript/factory))
  (^js [tag-name]
   (.createJSDocDeprecatedTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocDeprecatedTag typescript/factory tag-name comment)))

(defn update-js-doc-deprecated-tag
  (^js [node]
   (.updateJSDocDeprecatedTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocDeprecatedTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocDeprecatedTag typescript/factory node tag-name comment)))

(defn create-js-doc-override-tag
  (^js []
   (.createJSDocOverrideTag typescript/factory))
  (^js [tag-name]
   (.createJSDocOverrideTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocOverrideTag typescript/factory tag-name comment)))

(defn update-js-doc-override-tag
  (^js [node]
   (.updateJSDocOverrideTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocOverrideTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocOverrideTag typescript/factory node tag-name comment)))

(defn create-js-doc-throws-tag
  (^js [tag-name]
   (.createJSDocThrowsTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocThrowsTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocThrowsTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-throws-tag
  (^js [node]
   (.updateJSDocThrowsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocThrowsTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocThrowsTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocThrowsTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-satisfies-tag
  (^js []
   (.createJSDocSatisfiesTag typescript/factory))
  (^js [tag-name]
   (.createJSDocSatisfiesTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocSatisfiesTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocSatisfiesTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-satisfies-tag
  (^js [node]
   (.updateJSDocSatisfiesTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocSatisfiesTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocSatisfiesTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocSatisfiesTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-text
  ^js [text]
  (.createJSDocText typescript/factory text))

(defn update-js-doc-text
  ^js [node text]
  (.updateJSDocText typescript/factory node text))

(defn create-js-doc-comment
  (^js []
   (.createJSDocComment typescript/factory))
  (^js [comment]
   (.createJSDocComment typescript/factory comment))
  (^js [comment tags]
   (.createJSDocComment typescript/factory comment tags)))

(defn update-js-doc-comment
  (^js [node]
   (.updateJSDocComment typescript/factory node))
  (^js [node comment]
   (.updateJSDocComment typescript/factory node comment))
  (^js [node comment tags]
   (.updateJSDocComment typescript/factory node comment tags)))

(defn create-jsx-element
  ^js [opening-element children closing-element]
  (.createJsxElement typescript/factory opening-element children closing-element))

(defn update-jsx-element
  ^js [node opening-element children closing-element]
  (.updateJsxElement typescript/factory node opening-element children closing-element))

(defn create-jsx-self-closing-element
  (^js [tag-name]
   (.createJsxSelfClosingElement typescript/factory tag-name))
  (^js [tag-name type-arguments]
   (.createJsxSelfClosingElement typescript/factory tag-name type-arguments))
  (^js [tag-name type-arguments attributes]
   (.createJsxSelfClosingElement typescript/factory tag-name type-arguments attributes)))

(defn update-jsx-self-closing-element
  (^js [node tag-name]
   (.updateJsxSelfClosingElement typescript/factory node tag-name))
  (^js [node tag-name type-arguments]
   (.updateJsxSelfClosingElement typescript/factory node tag-name type-arguments))
  (^js [node tag-name type-arguments attributes]
   (.updateJsxSelfClosingElement typescript/factory node tag-name type-arguments attributes)))

(defn create-jsx-opening-element
  (^js [tag-name]
   (.createJsxOpeningElement typescript/factory tag-name))
  (^js [tag-name type-arguments]
   (.createJsxOpeningElement typescript/factory tag-name type-arguments))
  (^js [tag-name type-arguments attributes]
   (.createJsxOpeningElement typescript/factory tag-name type-arguments attributes)))

(defn update-jsx-opening-element
  (^js [node tag-name]
   (.updateJsxOpeningElement typescript/factory node tag-name))
  (^js [node tag-name type-arguments]
   (.updateJsxOpeningElement typescript/factory node tag-name type-arguments))
  (^js [node tag-name type-arguments attributes]
   (.updateJsxOpeningElement typescript/factory node tag-name type-arguments attributes)))

(defn create-jsx-closing-element
  ^js [tag-name]
  (.createJsxClosingElement typescript/factory tag-name))

(defn update-jsx-closing-element
  ^js [node tag-name]
  (.updateJsxClosingElement typescript/factory node tag-name))

(defn create-jsx-fragment
  ^js [opening-fragment children closing-fragment]
  (.createJsxFragment typescript/factory opening-fragment children closing-fragment))

(defn create-jsx-text
  (^js [text]
   (.createJsxText typescript/factory text))
  (^js [text contains-only-trivia-white-spaces?]
   (.createJsxText typescript/factory text contains-only-trivia-white-spaces?)))

(defn update-jsx-text
  (^js [node text]
   (.updateJsxText typescript/factory node text))
  (^js [node text contains-only-trivia-white-spaces?]
   (.updateJsxText typescript/factory node text contains-only-trivia-white-spaces?)))

(defn create-jsx-opening-fragment
  ^js []
  (.createJsxOpeningFragment typescript/factory))

(defn create-jsx-jsx-closing-fragment
  ^js []
  (.createJsxJsxClosingFragment typescript/factory))

(defn update-jsx-fragment
  ^js [node opening-fragment children closing-fragment]
  (.updateJsxFragment typescript/factory node opening-fragment children closing-fragment))

(defn create-jsx-attribute
  (^js [name]
   (.createJsxAttribute typescript/factory name))
  (^js [name initializer]
   (.createJsxAttribute typescript/factory name initializer)))

(defn update-jsx-attribute
  (^js [node name]
   (.updateJsxAttribute typescript/factory node name))
  (^js [node name initializer]
   (.updateJsxAttribute typescript/factory node name initializer)))

(defn create-jsx-attributes
  ^js [properties]
  (.createJsxAttributes typescript/factory properties))

(defn update-jsx-attributes
  ^js [node properties]
  (.updateJsxAttributes typescript/factory node properties))

(defn create-jsx-spread-attribute
  ^js [expression]
  (.createJsxSpreadAttribute typescript/factory expression))

(defn update-jsx-spread-attribute
  ^js [node expression]
  (.updateJsxSpreadAttribute typescript/factory node expression))

(defn create-jsx-expression
  (^js []
   (.createJsxExpression typescript/factory))
  (^js [dot-dot-dot-token]
   (.createJsxExpression typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token expression]
   (.createJsxExpression typescript/factory dot-dot-dot-token expression)))

(defn update-jsx-expression
  (^js [node]
   (.updateJsxExpression typescript/factory node))
  (^js [node expression]
   (.updateJsxExpression typescript/factory node expression)))

(defn create-jsx-namespaced-name
  ^js [namespace name]
  (.createJsxNamespacedName typescript/factory namespace name))

(defn update-jsx-namespaced-name
  ^js [node namespace name]
  (.updateJsxNamespacedName typescript/factory node namespace name))

(defn create-case-clause
  ^js [expression statements]
  (.createCaseClause typescript/factory expression statements))

(defn update-case-clause
  ^js [node expression statements]
  (.updateCaseClause typescript/factory node expression statements))

(defn create-default-clause
  ^js [statements]
  (.createDefaultClause typescript/factory statements))

(defn update-default-clause
  ^js [node statements]
  (.updateDefaultClause typescript/factory node statements))

(defn create-heritage-clause
  ^js [token types]
  (.createHeritageClause typescript/factory token types))

(defn update-heritage-clause
  ^js [node types]
  (.updateHeritageClause typescript/factory node types))

(defn create-catch-clause
  (^js []
   (.createCatchClause typescript/factory))
  (^js [variable-declaration]
   (.createCatchClause typescript/factory variable-declaration))
  (^js [variable-declaration block]
   (.createCatchClause typescript/factory variable-declaration block)))

(defn update-catch-clause
  (^js [node]
   (.updateCatchClause typescript/factory node))
  (^js [node variable-declaration]
   (.updateCatchClause typescript/factory node variable-declaration))
  (^js [node variable-declaration block]
   (.updateCatchClause typescript/factory node variable-declaration block)))

(defn create-property-assignment
  ^js [name initializer]
  (.createPropertyAssignment typescript/factory name initializer))

(defn update-property-assignment
  ^js [node name initializer]
  (.updatePropertyAssignment typescript/factory node name initializer))

(defn create-shorthand-property-assignment
  (^js [name]
   (.createShorthandPropertyAssignment typescript/factory name))
  (^js [name object-assignment-initializer]
   (.createShorthandPropertyAssignment typescript/factory name object-assignment-initializer)))

(defn update-shorthand-property-assignment
  (^js [node name]
   (.updateShorthandPropertyAssignment typescript/factory node name))
  (^js [node name object-assignment-initializer]
   (.updateShorthandPropertyAssignment typescript/factory node name object-assignment-initializer)))

(defn create-spread-assignment
  ^js [expression]
  (.createSpreadAssignment typescript/factory expression))

(defn update-spread-assignment
  ^js [node expression]
  (.updateSpreadAssignment typescript/factory node expression))

(defn create-enum-member
  (^js [name]
   (.createEnumMember typescript/factory name))
  (^js [name initializer]
   (.createEnumMember typescript/factory name initializer)))

(defn update-enum-member
  (^js [node name]
   (.updateEnumMember typescript/factory node name))
  (^js [node name initializer]
   (.updateEnumMember typescript/factory node name initializer)))

(defn create-source-file
  ^js [statements end-of-file-token flags]
  (.createSourceFile typescript/factory statements end-of-file-token flags))

(defn update-source-file
  (^js [node statements]
   (.updateSourceFile typescript/factory node statements))
  (^js [node statements declaration-file?]
   (.updateSourceFile typescript/factory node statements declaration-file?))
  (^js [node statements declaration-file? referenced-files]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files))
  (^js [node statements declaration-file? referenced-files type-references]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files type-references))
  (^js [node statements declaration-file? referenced-files type-references has-no-default-lib?]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files type-references has-no-default-lib?))
  (^js [node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references)))

(defn create-not-emitted-statement
  ^js [original]
  (.createNotEmittedStatement typescript/factory original))

(defn create-partially-emitted-expression
  (^js [expression]
   (.createPartiallyEmittedExpression typescript/factory expression))
  (^js [expression original]
   (.createPartiallyEmittedExpression typescript/factory expression original)))

(defn update-partially-emitted-expression
  ^js [node expression]
  (.updatePartiallyEmittedExpression typescript/factory node expression))

(defn create-comma-list-expression
  ^js [elements]
  (.createCommaListExpression typescript/factory elements))

(defn update-comma-list-expression
  ^js [node elements]
  (.updateCommaListExpression typescript/factory node elements))

(defn create-bundle
  (^js [source-files]
   (.createBundle typescript/factory source-files))
  (^js [source-files prepends]
   (.createBundle typescript/factory source-files prepends)))

(defn update-bundle
  (^js [node source-files]
   (.updateBundle typescript/factory node source-files))
  (^js [node source-files prepends]
   (.updateBundle typescript/factory node source-files prepends)))

(defn create-comma
  ^js [left right]
  (.createComma typescript/factory left right))

(defn create-assignment
  ^js [left right]
  (.createAssignment typescript/factory left right))

(defn create-logical-or
  ^js [left right]
  (.createLogicalOr typescript/factory left right))

(defn create-logical-and
  ^js [left right]
  (.createLogicalAnd typescript/factory left right))

(defn create-bitwise-or
  ^js [left right]
  (.createBitwiseOr typescript/factory left right))

(defn create-bitwise-xor
  ^js [left right]
  (.createBitwiseXor typescript/factory left right))

(defn create-bitwise-and
  ^js [left right]
  (.createBitwiseAnd typescript/factory left right))

(defn create-strict-equality
  ^js [left right]
  (.createStrictEquality typescript/factory left right))

(defn create-strict-inequality
  ^js [left right]
  (.createStrictInequality typescript/factory left right))

(defn create-equality
  ^js [left right]
  (.createEquality typescript/factory left right))

(defn create-inequality
  ^js [left right]
  (.createInequality typescript/factory left right))

(defn create-less-than
  ^js [left right]
  (.createLessThan typescript/factory left right))

(defn create-less-than-equals
  ^js [left right]
  (.createLessThanEquals typescript/factory left right))

(defn create-greater-than
  ^js [left right]
  (.createGreaterThan typescript/factory left right))

(defn create-greater-than-equals
  ^js [left right]
  (.createGreaterThanEquals typescript/factory left right))

(defn create-left-shift
  ^js [left right]
  (.createLeftShift typescript/factory left right))

(defn create-right-shift
  ^js [left right]
  (.createRightShift typescript/factory left right))

(defn create-unsigned-right-shift
  ^js [left right]
  (.createUnsignedRightShift typescript/factory left right))

(defn create-add
  ^js [left right]
  (.createAdd typescript/factory left right))

(defn create-subtract
  ^js [left right]
  (.createSubtract typescript/factory left right))

(defn create-multiply
  ^js [left right]
  (.createMultiply typescript/factory left right))

(defn create-divide
  ^js [left right]
  (.createDivide typescript/factory left right))

(defn create-modulo
  ^js [left right]
  (.createModulo typescript/factory left right))

(defn create-exponent
  ^js [left right]
  (.createExponent typescript/factory left right))

(defn create-prefix-plus
  ^js [operand]
  (.createPrefixPlus typescript/factory operand))

(defn create-prefix-minus
  ^js [operand]
  (.createPrefixMinus typescript/factory operand))

(defn create-prefix-increment
  ^js [operand]
  (.createPrefixIncrement typescript/factory operand))

(defn create-prefix-decrement
  ^js [operand]
  (.createPrefixDecrement typescript/factory operand))

(defn create-bitwise-not
  ^js [operand]
  (.createBitwiseNot typescript/factory operand))

(defn create-logical-not
  ^js [operand]
  (.createLogicalNot typescript/factory operand))

(defn create-postfix-increment
  ^js [operand]
  (.createPostfixIncrement typescript/factory operand))

(defn create-postfix-decrement
  ^js [operand]
  (.createPostfixDecrement typescript/factory operand))

(defn create-immediately-invoked-function-expression
  (^js [statements]
   (.createImmediatelyInvokedFunctionExpression typescript/factory statements))
  (^js [statements param param-value]
   (.createImmediatelyInvokedFunctionExpression typescript/factory statements param param-value)))

(defn create-immediately-invoked-arrow-function
  (^js [statements]
   (.createImmediatelyInvokedArrowFunction typescript/factory statements))
  (^js [statements param param-value]
   (.createImmediatelyInvokedArrowFunction typescript/factory statements param param-value)))

(defn create-void-zero
  ^js []
  (.createVoidZero typescript/factory))

(defn create-export-default
  ^js [expression]
  (.createExportDefault typescript/factory expression))

(defn create-external-module-export
  ^js [export-name]
  (.createExternalModuleExport typescript/factory export-name))

(defn restore-outer-expressions
  (^js []
   (.restoreOuterExpressions typescript/factory))
  (^js [outer-expression]
   (.restoreOuterExpressions typescript/factory outer-expression))
  (^js [outer-expression inner-expression]
   (.restoreOuterExpressions typescript/factory outer-expression inner-expression))
  (^js [outer-expression inner-expression kinds]
   (.restoreOuterExpressions typescript/factory outer-expression inner-expression kinds)))
