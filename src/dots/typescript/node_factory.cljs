(ns dots.typescript.node-factory)

(defn create-node-array
  (^js [node-factory]
   (.createNodeArray ^js node-factory))
  (^js [node-factory elements]
   (.createNodeArray ^js node-factory elements))
  (^js [node-factory elements has-trailing-comma?]
   (.createNodeArray ^js node-factory elements has-trailing-comma?)))

(defn create-numeric-literal
  (^js [node-factory value]
   (.createNumericLiteral ^js node-factory value))
  (^js [node-factory value numeric-literal-flags]
   (.createNumericLiteral ^js node-factory value numeric-literal-flags)))

(defn create-big-int-literal
  ^js [node-factory value]
  (.createBigIntLiteral ^js node-factory value))

(defn create-string-literal
  (^js [node-factory text]
   (.createStringLiteral ^js node-factory text))
  (^js [node-factory text single-quote?]
   (.createStringLiteral ^js node-factory text single-quote?)))

(defn create-string-literal-from-node
  (^js [node-factory source-node]
   (.createStringLiteralFromNode ^js node-factory source-node))
  (^js [node-factory source-node single-quote?]
   (.createStringLiteralFromNode ^js node-factory source-node single-quote?)))

(defn create-regular-expression-literal
  ^js [node-factory text]
  (.createRegularExpressionLiteral ^js node-factory text))

(defn create-identifier
  ^js [node-factory text]
  (.createIdentifier ^js node-factory text))

(defn create-temp-variable
  "Create a unique temporary variable."
  (^js [node-factory]
   (.createTempVariable ^js node-factory))
  (^js [node-factory record-temp-variable]
   (.createTempVariable ^js node-factory record-temp-variable))
  (^js [node-factory record-temp-variable reserved-in-nested-scopes?]
   (.createTempVariable ^js node-factory record-temp-variable reserved-in-nested-scopes?)))

(defn create-loop-variable
  "Create a unique temporary variable for use in a loop."
  (^js [node-factory]
   (.createLoopVariable ^js node-factory))
  (^js [node-factory reserved-in-nested-scopes?]
   (.createLoopVariable ^js node-factory reserved-in-nested-scopes?)))

(defn create-unique-name
  "Create a unique name based on the supplied text."
  (^js [node-factory text]
   (.createUniqueName ^js node-factory text))
  (^js [node-factory text flags]
   (.createUniqueName ^js node-factory text flags)))

(defn generated-name-for-node
  "Create a unique name generated for a node."
  (^js [node-factory]
   (.getGeneratedNameForNode ^js node-factory))
  (^js [node-factory node]
   (.getGeneratedNameForNode ^js node-factory node))
  (^js [node-factory node flags]
   (.getGeneratedNameForNode ^js node-factory node flags)))

(defn create-private-identifier
  ^js [node-factory text]
  (.createPrivateIdentifier ^js node-factory text))

(defn create-token
  ^js [node-factory token]
  (.createToken ^js node-factory token))

(defn create-super
  ^js [node-factory]
  (.createSuper ^js node-factory))

(defn create-this
  ^js [node-factory]
  (.createThis ^js node-factory))

(defn create-null
  ^js [node-factory]
  (.createNull ^js node-factory))

(defn create-true
  ^js [node-factory]
  (.createTrue ^js node-factory))

(defn create-false
  ^js [node-factory]
  (.createFalse ^js node-factory))

(defn create-modifier
  ^js [node-factory kind]
  (.createModifier ^js node-factory kind))

(defn create-modifiers-from-modifier-flags
  ^js [node-factory flags]
  (.createModifiersFromModifierFlags ^js node-factory flags))

(defn create-qualified-name
  ^js [node-factory left right]
  (.createQualifiedName ^js node-factory left right))

(defn update-qualified-name
  ^js [node-factory node left right]
  (.updateQualifiedName ^js node-factory node left right))

(defn create-computed-property-name
  ^js [node-factory expression]
  (.createComputedPropertyName ^js node-factory expression))

(defn update-computed-property-name
  ^js [node-factory node expression]
  (.updateComputedPropertyName ^js node-factory node expression))

(defn create-type-parameter-declaration
  {:arglists '([node-factory]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name constraint]
               [node-factory modifiers name constraint default-type]
               [node-factory name]
               [node-factory name constraint]
               [node-factory name constraint default-type])}
  (^js [node-factory]
   (.createTypeParameterDeclaration ^js node-factory))
  (^js [a b]
   (.createTypeParameterDeclaration ^js a b))
  (^js [a b c]
   (.createTypeParameterDeclaration ^js a b c))
  (^js [a b c d]
   (.createTypeParameterDeclaration ^js a b c d))
  (^js [node-factory modifiers name constraint default-type]
   (.createTypeParameterDeclaration ^js node-factory modifiers name constraint default-type)))

(defn update-type-parameter-declaration
  {:arglists '([node-factory node]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name constraint]
               [node-factory node modifiers name constraint default-type]
               [node-factory node name]
               [node-factory node name constraint]
               [node-factory node name constraint default-type])}
  (^js [node-factory node]
   (.updateTypeParameterDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateTypeParameterDeclaration ^js a b c))
  (^js [a b c d]
   (.updateTypeParameterDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateTypeParameterDeclaration ^js a b c d e))
  (^js [node-factory node modifiers name constraint default-type]
   (.updateTypeParameterDeclaration ^js node-factory node modifiers name constraint default-type)))

(defn create-parameter-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers dot-dot-dot-token]
               [node-factory decorators modifiers dot-dot-dot-token name]
               [node-factory decorators modifiers dot-dot-dot-token name question-token]
               [node-factory decorators modifiers dot-dot-dot-token name question-token type]
               [node-factory decorators modifiers dot-dot-dot-token name question-token type initializer]
               [node-factory modifiers]
               [node-factory modifiers dot-dot-dot-token]
               [node-factory modifiers dot-dot-dot-token name]
               [node-factory modifiers dot-dot-dot-token name question-token]
               [node-factory modifiers dot-dot-dot-token name question-token type]
               [node-factory modifiers dot-dot-dot-token name question-token type initializer])}
  (^js [node-factory]
   (.createParameterDeclaration ^js node-factory))
  (^js [a b]
   (.createParameterDeclaration ^js a b))
  (^js [a b c]
   (.createParameterDeclaration ^js a b c))
  (^js [a b c d]
   (.createParameterDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createParameterDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createParameterDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.createParameterDeclaration ^js a b c d e f g))
  (^js [node-factory decorators modifiers dot-dot-dot-token name question-token type initializer]
   (.createParameterDeclaration ^js node-factory decorators modifiers dot-dot-dot-token name question-token type initializer)))

(defn update-parameter-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers dot-dot-dot-token]
               [node-factory node decorators modifiers dot-dot-dot-token name]
               [node-factory node decorators modifiers dot-dot-dot-token name question-token]
               [node-factory node decorators modifiers dot-dot-dot-token name question-token type]
               [node-factory node decorators modifiers dot-dot-dot-token name question-token type initializer]
               [node-factory node modifiers]
               [node-factory node modifiers dot-dot-dot-token]
               [node-factory node modifiers dot-dot-dot-token name]
               [node-factory node modifiers dot-dot-dot-token name question-token]
               [node-factory node modifiers dot-dot-dot-token name question-token type]
               [node-factory node modifiers dot-dot-dot-token name question-token type initializer])}
  (^js [node-factory node]
   (.updateParameterDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateParameterDeclaration ^js a b c))
  (^js [a b c d]
   (.updateParameterDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateParameterDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateParameterDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateParameterDeclaration ^js a b c d e f g))
  (^js [a b c d e f g h]
   (.updateParameterDeclaration ^js a b c d e f g h))
  (^js [node-factory node decorators modifiers dot-dot-dot-token name question-token type initializer]
   (.updateParameterDeclaration ^js node-factory node decorators modifiers dot-dot-dot-token name question-token type initializer)))

(defn create-decorator
  ^js [node-factory expression]
  (.createDecorator ^js node-factory expression))

(defn update-decorator
  ^js [node-factory node expression]
  (.updateDecorator ^js node-factory node expression))

(defn create-property-signature
  (^js [node-factory]
   (.createPropertySignature ^js node-factory))
  (^js [node-factory modifiers]
   (.createPropertySignature ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createPropertySignature ^js node-factory modifiers name))
  (^js [node-factory modifiers name question-token]
   (.createPropertySignature ^js node-factory modifiers name question-token))
  (^js [node-factory modifiers name question-token type]
   (.createPropertySignature ^js node-factory modifiers name question-token type)))

(defn update-property-signature
  (^js [node-factory node]
   (.updatePropertySignature ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updatePropertySignature ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updatePropertySignature ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name question-token]
   (.updatePropertySignature ^js node-factory node modifiers name question-token))
  (^js [node-factory node modifiers name question-token type]
   (.updatePropertySignature ^js node-factory node modifiers name question-token type)))

(defn create-property-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name question-or-exclamation-token]
               [node-factory decorators modifiers name question-or-exclamation-token type]
               [node-factory decorators modifiers name question-or-exclamation-token type initializer]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name question-or-exclamation-token]
               [node-factory modifiers name question-or-exclamation-token type]
               [node-factory modifiers name question-or-exclamation-token type initializer])}
  (^js [node-factory]
   (.createPropertyDeclaration ^js node-factory))
  (^js [a b]
   (.createPropertyDeclaration ^js a b))
  (^js [a b c]
   (.createPropertyDeclaration ^js a b c))
  (^js [a b c d]
   (.createPropertyDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createPropertyDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createPropertyDeclaration ^js a b c d e f))
  (^js [node-factory decorators modifiers name question-or-exclamation-token type initializer]
   (.createPropertyDeclaration ^js node-factory decorators modifiers name question-or-exclamation-token type initializer)))

(defn update-property-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name question-or-exclamation-token]
               [node-factory node decorators modifiers name question-or-exclamation-token type]
               [node-factory node decorators modifiers name question-or-exclamation-token type initializer]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name question-or-exclamation-token]
               [node-factory node modifiers name question-or-exclamation-token type]
               [node-factory node modifiers name question-or-exclamation-token type initializer])}
  (^js [node-factory node]
   (.updatePropertyDeclaration ^js node-factory node))
  (^js [a b c]
   (.updatePropertyDeclaration ^js a b c))
  (^js [a b c d]
   (.updatePropertyDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updatePropertyDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updatePropertyDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updatePropertyDeclaration ^js a b c d e f g))
  (^js [node-factory node decorators modifiers name question-or-exclamation-token type initializer]
   (.updatePropertyDeclaration ^js node-factory node decorators modifiers name question-or-exclamation-token type initializer)))

(defn create-method-signature
  (^js [node-factory]
   (.createMethodSignature ^js node-factory))
  (^js [node-factory modifiers]
   (.createMethodSignature ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createMethodSignature ^js node-factory modifiers name))
  (^js [node-factory modifiers name question-token]
   (.createMethodSignature ^js node-factory modifiers name question-token))
  (^js [node-factory modifiers name question-token type-parameters]
   (.createMethodSignature ^js node-factory modifiers name question-token type-parameters))
  (^js [node-factory modifiers name question-token type-parameters parameters]
   (.createMethodSignature ^js node-factory modifiers name question-token type-parameters parameters))
  (^js [node-factory modifiers name question-token type-parameters parameters type]
   (.createMethodSignature ^js node-factory modifiers name question-token type-parameters parameters type)))

(defn update-method-signature
  (^js [node-factory node]
   (.updateMethodSignature ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateMethodSignature ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateMethodSignature ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name question-token]
   (.updateMethodSignature ^js node-factory node modifiers name question-token))
  (^js [node-factory node modifiers name question-token type-parameters]
   (.updateMethodSignature ^js node-factory node modifiers name question-token type-parameters))
  (^js [node-factory node modifiers name question-token type-parameters parameters]
   (.updateMethodSignature ^js node-factory node modifiers name question-token type-parameters parameters))
  (^js [node-factory node modifiers name question-token type-parameters parameters type]
   (.updateMethodSignature ^js node-factory node modifiers name question-token type-parameters parameters type)))

(defn create-method-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers asterisk-token]
               [node-factory decorators modifiers asterisk-token name]
               [node-factory decorators modifiers asterisk-token name question-token]
               [node-factory decorators modifiers asterisk-token name question-token type-parameters]
               [node-factory decorators modifiers asterisk-token name question-token type-parameters parameters]
               [node-factory decorators modifiers asterisk-token name question-token type-parameters parameters type]
               [node-factory decorators modifiers asterisk-token name question-token type-parameters parameters type body]
               [node-factory modifiers]
               [node-factory modifiers asterisk-token]
               [node-factory modifiers asterisk-token name]
               [node-factory modifiers asterisk-token name question-token]
               [node-factory modifiers asterisk-token name question-token type-parameters]
               [node-factory modifiers asterisk-token name question-token type-parameters parameters]
               [node-factory modifiers asterisk-token name question-token type-parameters parameters type]
               [node-factory modifiers asterisk-token name question-token type-parameters parameters type body])}
  (^js [node-factory]
   (.createMethodDeclaration ^js node-factory))
  (^js [a b]
   (.createMethodDeclaration ^js a b))
  (^js [a b c]
   (.createMethodDeclaration ^js a b c))
  (^js [a b c d]
   (.createMethodDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createMethodDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createMethodDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.createMethodDeclaration ^js a b c d e f g))
  (^js [a b c d e f g h]
   (.createMethodDeclaration ^js a b c d e f g h))
  (^js [a b c d e f g h i]
   (.createMethodDeclaration ^js a b c d e f g h i))
  (^js [node-factory decorators modifiers asterisk-token name question-token type-parameters parameters type body]
   (.createMethodDeclaration ^js node-factory decorators modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn update-method-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers asterisk-token]
               [node-factory node decorators modifiers asterisk-token name]
               [node-factory node decorators modifiers asterisk-token name question-token]
               [node-factory node decorators modifiers asterisk-token name question-token type-parameters]
               [node-factory node decorators modifiers asterisk-token name question-token type-parameters parameters]
               [node-factory node decorators modifiers asterisk-token name question-token type-parameters parameters type]
               [node-factory node decorators modifiers asterisk-token name question-token type-parameters parameters type body]
               [node-factory node modifiers]
               [node-factory node modifiers asterisk-token]
               [node-factory node modifiers asterisk-token name]
               [node-factory node modifiers asterisk-token name question-token]
               [node-factory node modifiers asterisk-token name question-token type-parameters]
               [node-factory node modifiers asterisk-token name question-token type-parameters parameters]
               [node-factory node modifiers asterisk-token name question-token type-parameters parameters type]
               [node-factory node modifiers asterisk-token name question-token type-parameters parameters type body])}
  (^js [node-factory node]
   (.updateMethodDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateMethodDeclaration ^js a b c))
  (^js [a b c d]
   (.updateMethodDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateMethodDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateMethodDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateMethodDeclaration ^js a b c d e f g))
  (^js [a b c d e f g h]
   (.updateMethodDeclaration ^js a b c d e f g h))
  (^js [a b c d e f g h i]
   (.updateMethodDeclaration ^js a b c d e f g h i))
  (^js [a b c d e f g h i j]
   (.updateMethodDeclaration ^js a b c d e f g h i j))
  (^js [node-factory node decorators modifiers asterisk-token name question-token type-parameters parameters type body]
   (.updateMethodDeclaration ^js node-factory node decorators modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn create-constructor-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers parameters]
               [node-factory decorators modifiers parameters body]
               [node-factory modifiers]
               [node-factory modifiers parameters]
               [node-factory modifiers parameters body])}
  (^js [node-factory]
   (.createConstructorDeclaration ^js node-factory))
  (^js [a b]
   (.createConstructorDeclaration ^js a b))
  (^js [a b c]
   (.createConstructorDeclaration ^js a b c))
  (^js [a b c d]
   (.createConstructorDeclaration ^js a b c d))
  (^js [node-factory decorators modifiers parameters body]
   (.createConstructorDeclaration ^js node-factory decorators modifiers parameters body)))

(defn update-constructor-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers parameters]
               [node-factory node decorators modifiers parameters body]
               [node-factory node modifiers]
               [node-factory node modifiers parameters]
               [node-factory node modifiers parameters body])}
  (^js [node-factory node]
   (.updateConstructorDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateConstructorDeclaration ^js a b c))
  (^js [a b c d]
   (.updateConstructorDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateConstructorDeclaration ^js a b c d e))
  (^js [node-factory node decorators modifiers parameters body]
   (.updateConstructorDeclaration ^js node-factory node decorators modifiers parameters body)))

(defn create-get-accessor-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name parameters]
               [node-factory decorators modifiers name parameters type]
               [node-factory decorators modifiers name parameters type body]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name parameters]
               [node-factory modifiers name parameters type]
               [node-factory modifiers name parameters type body])}
  (^js [node-factory]
   (.createGetAccessorDeclaration ^js node-factory))
  (^js [a b]
   (.createGetAccessorDeclaration ^js a b))
  (^js [a b c]
   (.createGetAccessorDeclaration ^js a b c))
  (^js [a b c d]
   (.createGetAccessorDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createGetAccessorDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createGetAccessorDeclaration ^js a b c d e f))
  (^js [node-factory decorators modifiers name parameters type body]
   (.createGetAccessorDeclaration ^js node-factory decorators modifiers name parameters type body)))

(defn update-get-accessor-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name parameters]
               [node-factory node decorators modifiers name parameters type]
               [node-factory node decorators modifiers name parameters type body]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name parameters]
               [node-factory node modifiers name parameters type]
               [node-factory node modifiers name parameters type body])}
  (^js [node-factory node]
   (.updateGetAccessorDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateGetAccessorDeclaration ^js a b c))
  (^js [a b c d]
   (.updateGetAccessorDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateGetAccessorDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateGetAccessorDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateGetAccessorDeclaration ^js a b c d e f g))
  (^js [node-factory node decorators modifiers name parameters type body]
   (.updateGetAccessorDeclaration ^js node-factory node decorators modifiers name parameters type body)))

(defn create-set-accessor-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name parameters]
               [node-factory decorators modifiers name parameters body]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name parameters]
               [node-factory modifiers name parameters body])}
  (^js [node-factory]
   (.createSetAccessorDeclaration ^js node-factory))
  (^js [a b]
   (.createSetAccessorDeclaration ^js a b))
  (^js [a b c]
   (.createSetAccessorDeclaration ^js a b c))
  (^js [a b c d]
   (.createSetAccessorDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createSetAccessorDeclaration ^js a b c d e))
  (^js [node-factory decorators modifiers name parameters body]
   (.createSetAccessorDeclaration ^js node-factory decorators modifiers name parameters body)))

(defn update-set-accessor-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name parameters]
               [node-factory node decorators modifiers name parameters body]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name parameters]
               [node-factory node modifiers name parameters body])}
  (^js [node-factory node]
   (.updateSetAccessorDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateSetAccessorDeclaration ^js a b c))
  (^js [a b c d]
   (.updateSetAccessorDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateSetAccessorDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateSetAccessorDeclaration ^js a b c d e f))
  (^js [node-factory node decorators modifiers name parameters body]
   (.updateSetAccessorDeclaration ^js node-factory node decorators modifiers name parameters body)))

(defn create-call-signature
  (^js [node-factory]
   (.createCallSignature ^js node-factory))
  (^js [node-factory type-parameters]
   (.createCallSignature ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createCallSignature ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createCallSignature ^js node-factory type-parameters parameters type)))

(defn update-call-signature
  (^js [node-factory node]
   (.updateCallSignature ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateCallSignature ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateCallSignature ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateCallSignature ^js node-factory node type-parameters parameters type)))

(defn create-construct-signature
  (^js [node-factory]
   (.createConstructSignature ^js node-factory))
  (^js [node-factory type-parameters]
   (.createConstructSignature ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createConstructSignature ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createConstructSignature ^js node-factory type-parameters parameters type)))

(defn update-construct-signature
  (^js [node-factory node]
   (.updateConstructSignature ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateConstructSignature ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateConstructSignature ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateConstructSignature ^js node-factory node type-parameters parameters type)))

(defn create-index-signature
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers parameters]
               [node-factory decorators modifiers parameters type]
               [node-factory modifiers]
               [node-factory modifiers parameters]
               [node-factory modifiers parameters type])}
  (^js [node-factory]
   (.createIndexSignature ^js node-factory))
  (^js [a b]
   (.createIndexSignature ^js a b))
  (^js [a b c]
   (.createIndexSignature ^js a b c))
  (^js [a b c d]
   (.createIndexSignature ^js a b c d))
  (^js [node-factory decorators modifiers parameters type]
   (.createIndexSignature ^js node-factory decorators modifiers parameters type)))

(defn update-index-signature
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers parameters]
               [node-factory node decorators modifiers parameters type]
               [node-factory node modifiers]
               [node-factory node modifiers parameters]
               [node-factory node modifiers parameters type])}
  (^js [node-factory node]
   (.updateIndexSignature ^js node-factory node))
  (^js [a b c]
   (.updateIndexSignature ^js a b c))
  (^js [a b c d]
   (.updateIndexSignature ^js a b c d))
  (^js [a b c d e]
   (.updateIndexSignature ^js a b c d e))
  (^js [node-factory node decorators modifiers parameters type]
   (.updateIndexSignature ^js node-factory node decorators modifiers parameters type)))

(defn create-template-literal-type-span
  ^js [node-factory type literal]
  (.createTemplateLiteralTypeSpan ^js node-factory type literal))

(defn update-template-literal-type-span
  ^js [node-factory node type literal]
  (.updateTemplateLiteralTypeSpan ^js node-factory node type literal))

(defn create-class-static-block-declaration
  {:arglists '([node-factory]
               [node-factory body]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers body])}
  (^js [node-factory]
   (.createClassStaticBlockDeclaration ^js node-factory))
  (^js [a b]
   (.createClassStaticBlockDeclaration ^js a b))
  (^js [node-factory decorators modifiers]
   (.createClassStaticBlockDeclaration ^js node-factory decorators modifiers))
  (^js [node-factory decorators modifiers body]
   (.createClassStaticBlockDeclaration ^js node-factory decorators modifiers body)))

(defn update-class-static-block-declaration
  {:arglists '([node-factory node]
               [node-factory node body]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers body])}
  (^js [node-factory node]
   (.updateClassStaticBlockDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateClassStaticBlockDeclaration ^js a b c))
  (^js [node-factory node decorators modifiers]
   (.updateClassStaticBlockDeclaration ^js node-factory node decorators modifiers))
  (^js [node-factory node decorators modifiers body]
   (.updateClassStaticBlockDeclaration ^js node-factory node decorators modifiers body)))

(defn create-keyword-type-node
  ^js [node-factory kind]
  (.createKeywordTypeNode ^js node-factory kind))

(defn create-type-predicate-node
  (^js [node-factory]
   (.createTypePredicateNode ^js node-factory))
  (^js [node-factory asserts-modifier]
   (.createTypePredicateNode ^js node-factory asserts-modifier))
  (^js [node-factory asserts-modifier parameter-name]
   (.createTypePredicateNode ^js node-factory asserts-modifier parameter-name))
  (^js [node-factory asserts-modifier parameter-name type]
   (.createTypePredicateNode ^js node-factory asserts-modifier parameter-name type)))

(defn update-type-predicate-node
  (^js [node-factory node]
   (.updateTypePredicateNode ^js node-factory node))
  (^js [node-factory node asserts-modifier]
   (.updateTypePredicateNode ^js node-factory node asserts-modifier))
  (^js [node-factory node asserts-modifier parameter-name]
   (.updateTypePredicateNode ^js node-factory node asserts-modifier parameter-name))
  (^js [node-factory node asserts-modifier parameter-name type]
   (.updateTypePredicateNode ^js node-factory node asserts-modifier parameter-name type)))

(defn create-type-reference-node
  (^js [node-factory type-name]
   (.createTypeReferenceNode ^js node-factory type-name))
  (^js [node-factory type-name type-arguments]
   (.createTypeReferenceNode ^js node-factory type-name type-arguments)))

(defn update-type-reference-node
  (^js [node-factory node type-name]
   (.updateTypeReferenceNode ^js node-factory node type-name))
  (^js [node-factory node type-name type-arguments]
   (.updateTypeReferenceNode ^js node-factory node type-name type-arguments)))

(defn create-function-type-node
  (^js [node-factory]
   (.createFunctionTypeNode ^js node-factory))
  (^js [node-factory type-parameters]
   (.createFunctionTypeNode ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createFunctionTypeNode ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createFunctionTypeNode ^js node-factory type-parameters parameters type)))

(defn update-function-type-node
  (^js [node-factory node]
   (.updateFunctionTypeNode ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateFunctionTypeNode ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateFunctionTypeNode ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateFunctionTypeNode ^js node-factory node type-parameters parameters type)))

(defn create-constructor-type-node
  {:arglists '([node-factory]
               [node-factory modifiers]
               [node-factory modifiers type-parameters]
               [node-factory modifiers type-parameters parameters]
               [node-factory modifiers type-parameters parameters type]
               [node-factory type-parameters]
               [node-factory type-parameters parameters]
               [node-factory type-parameters parameters type])}
  (^js [node-factory]
   (.createConstructorTypeNode ^js node-factory))
  (^js [a b]
   (.createConstructorTypeNode ^js a b))
  (^js [a b c]
   (.createConstructorTypeNode ^js a b c))
  (^js [a b c d]
   (.createConstructorTypeNode ^js a b c d))
  (^js [node-factory modifiers type-parameters parameters type]
   (.createConstructorTypeNode ^js node-factory modifiers type-parameters parameters type)))

(defn update-constructor-type-node
  {:arglists '([node-factory node]
               [node-factory node modifiers]
               [node-factory node modifiers type-parameters]
               [node-factory node modifiers type-parameters parameters]
               [node-factory node modifiers type-parameters parameters type]
               [node-factory node type-parameters]
               [node-factory node type-parameters parameters]
               [node-factory node type-parameters parameters type])}
  (^js [node-factory node]
   (.updateConstructorTypeNode ^js node-factory node))
  (^js [a b c]
   (.updateConstructorTypeNode ^js a b c))
  (^js [a b c d]
   (.updateConstructorTypeNode ^js a b c d))
  (^js [a b c d e]
   (.updateConstructorTypeNode ^js a b c d e))
  (^js [node-factory node modifiers type-parameters parameters type]
   (.updateConstructorTypeNode ^js node-factory node modifiers type-parameters parameters type)))

(defn create-type-query-node
  (^js [node-factory expr-name]
   (.createTypeQueryNode ^js node-factory expr-name))
  (^js [node-factory expr-name type-arguments]
   (.createTypeQueryNode ^js node-factory expr-name type-arguments)))

(defn update-type-query-node
  (^js [node-factory node expr-name]
   (.updateTypeQueryNode ^js node-factory node expr-name))
  (^js [node-factory node expr-name type-arguments]
   (.updateTypeQueryNode ^js node-factory node expr-name type-arguments)))

(defn create-type-literal-node
  (^js [node-factory]
   (.createTypeLiteralNode ^js node-factory))
  (^js [node-factory members]
   (.createTypeLiteralNode ^js node-factory members)))

(defn update-type-literal-node
  ^js [node-factory node members]
  (.updateTypeLiteralNode ^js node-factory node members))

(defn create-array-type-node
  ^js [node-factory element-type]
  (.createArrayTypeNode ^js node-factory element-type))

(defn update-array-type-node
  ^js [node-factory node element-type]
  (.updateArrayTypeNode ^js node-factory node element-type))

(defn create-tuple-type-node
  ^js [node-factory elements]
  (.createTupleTypeNode ^js node-factory elements))

(defn update-tuple-type-node
  ^js [node-factory node elements]
  (.updateTupleTypeNode ^js node-factory node elements))

(defn create-named-tuple-member
  (^js [node-factory]
   (.createNamedTupleMember ^js node-factory))
  (^js [node-factory dot-dot-dot-token]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token))
  (^js [node-factory dot-dot-dot-token name]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token name))
  (^js [node-factory dot-dot-dot-token name question-token]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token name question-token))
  (^js [node-factory dot-dot-dot-token name question-token type]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token name question-token type)))

(defn update-named-tuple-member
  (^js [node-factory node]
   (.updateNamedTupleMember ^js node-factory node))
  (^js [node-factory node dot-dot-dot-token]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token))
  (^js [node-factory node dot-dot-dot-token name]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token name))
  (^js [node-factory node dot-dot-dot-token name question-token]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token name question-token))
  (^js [node-factory node dot-dot-dot-token name question-token type]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token name question-token type)))

(defn create-optional-type-node
  ^js [node-factory type]
  (.createOptionalTypeNode ^js node-factory type))

(defn update-optional-type-node
  ^js [node-factory node type]
  (.updateOptionalTypeNode ^js node-factory node type))

(defn create-rest-type-node
  ^js [node-factory type]
  (.createRestTypeNode ^js node-factory type))

(defn update-rest-type-node
  ^js [node-factory node type]
  (.updateRestTypeNode ^js node-factory node type))

(defn create-union-type-node
  ^js [node-factory types]
  (.createUnionTypeNode ^js node-factory types))

(defn update-union-type-node
  ^js [node-factory node types]
  (.updateUnionTypeNode ^js node-factory node types))

(defn create-intersection-type-node
  ^js [node-factory types]
  (.createIntersectionTypeNode ^js node-factory types))

(defn update-intersection-type-node
  ^js [node-factory node types]
  (.updateIntersectionTypeNode ^js node-factory node types))

(defn create-conditional-type-node
  ^js [node-factory check-type extends-type true-type false-type]
  (.createConditionalTypeNode ^js node-factory check-type extends-type true-type false-type))

(defn update-conditional-type-node
  ^js [node-factory node check-type extends-type true-type false-type]
  (.updateConditionalTypeNode ^js node-factory node check-type extends-type true-type false-type))

(defn create-infer-type-node
  ^js [node-factory type-parameter]
  (.createInferTypeNode ^js node-factory type-parameter))

(defn update-infer-type-node
  ^js [node-factory node type-parameter]
  (.updateInferTypeNode ^js node-factory node type-parameter))

(defn create-import-type-node
  {:arglists '([node-factory argument]
               [node-factory argument assertions]
               [node-factory argument assertions qualifier]
               [node-factory argument assertions qualifier type-arguments]
               [node-factory argument assertions qualifier type-arguments type-of?]
               [node-factory argument qualifier]
               [node-factory argument qualifier type-arguments]
               [node-factory argument qualifier type-arguments type-of?])}
  (^js [node-factory argument]
   (.createImportTypeNode ^js node-factory argument))
  (^js [a b c]
   (.createImportTypeNode ^js a b c))
  (^js [a b c d]
   (.createImportTypeNode ^js a b c d))
  (^js [a b c d e]
   (.createImportTypeNode ^js a b c d e))
  (^js [node-factory argument assertions qualifier type-arguments type-of?]
   (.createImportTypeNode ^js node-factory argument assertions qualifier type-arguments type-of?)))

(defn update-import-type-node
  {:arglists '([node-factory node argument]
               [node-factory node argument assertions]
               [node-factory node argument assertions qualifier]
               [node-factory node argument assertions qualifier type-arguments]
               [node-factory node argument assertions qualifier type-arguments type-of?]
               [node-factory node argument qualifier]
               [node-factory node argument qualifier type-arguments]
               [node-factory node argument qualifier type-arguments type-of?])}
  (^js [node-factory node argument]
   (.updateImportTypeNode ^js node-factory node argument))
  (^js [a b c d]
   (.updateImportTypeNode ^js a b c d))
  (^js [a b c d e]
   (.updateImportTypeNode ^js a b c d e))
  (^js [a b c d e f]
   (.updateImportTypeNode ^js a b c d e f))
  (^js [node-factory node argument assertions qualifier type-arguments type-of?]
   (.updateImportTypeNode ^js node-factory node argument assertions qualifier type-arguments type-of?)))

(defn create-parenthesized-type
  ^js [node-factory type]
  (.createParenthesizedType ^js node-factory type))

(defn update-parenthesized-type
  ^js [node-factory node type]
  (.updateParenthesizedType ^js node-factory node type))

(defn create-this-type-node
  ^js [node-factory]
  (.createThisTypeNode ^js node-factory))

(defn create-type-operator-node
  ^js [node-factory operator type]
  (.createTypeOperatorNode ^js node-factory operator type))

(defn update-type-operator-node
  ^js [node-factory node type]
  (.updateTypeOperatorNode ^js node-factory node type))

(defn create-indexed-access-type-node
  ^js [node-factory object-type index-type]
  (.createIndexedAccessTypeNode ^js node-factory object-type index-type))

(defn update-indexed-access-type-node
  ^js [node-factory node object-type index-type]
  (.updateIndexedAccessTypeNode ^js node-factory node object-type index-type))

(defn create-mapped-type-node
  (^js [node-factory]
   (.createMappedTypeNode ^js node-factory))
  (^js [node-factory readonly-token]
   (.createMappedTypeNode ^js node-factory readonly-token))
  (^js [node-factory readonly-token type-parameter]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter))
  (^js [node-factory readonly-token type-parameter name-type]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type))
  (^js [node-factory readonly-token type-parameter name-type question-token]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type question-token))
  (^js [node-factory readonly-token type-parameter name-type question-token type]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type question-token type))
  (^js [node-factory readonly-token type-parameter name-type question-token type members]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type question-token type members)))

(defn update-mapped-type-node
  (^js [node-factory node]
   (.updateMappedTypeNode ^js node-factory node))
  (^js [node-factory node readonly-token]
   (.updateMappedTypeNode ^js node-factory node readonly-token))
  (^js [node-factory node readonly-token type-parameter]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter))
  (^js [node-factory node readonly-token type-parameter name-type]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type))
  (^js [node-factory node readonly-token type-parameter name-type question-token]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type question-token))
  (^js [node-factory node readonly-token type-parameter name-type question-token type]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type question-token type))
  (^js [node-factory node readonly-token type-parameter name-type question-token type members]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type question-token type members)))

(defn create-literal-type-node
  ^js [node-factory literal]
  (.createLiteralTypeNode ^js node-factory literal))

(defn update-literal-type-node
  ^js [node-factory node literal]
  (.updateLiteralTypeNode ^js node-factory node literal))

(defn create-template-literal-type
  ^js [node-factory head template-spans]
  (.createTemplateLiteralType ^js node-factory head template-spans))

(defn update-template-literal-type
  ^js [node-factory node head template-spans]
  (.updateTemplateLiteralType ^js node-factory node head template-spans))

(defn create-object-binding-pattern
  ^js [node-factory elements]
  (.createObjectBindingPattern ^js node-factory elements))

(defn update-object-binding-pattern
  ^js [node-factory node elements]
  (.updateObjectBindingPattern ^js node-factory node elements))

(defn create-array-binding-pattern
  ^js [node-factory elements]
  (.createArrayBindingPattern ^js node-factory elements))

(defn update-array-binding-pattern
  ^js [node-factory node elements]
  (.updateArrayBindingPattern ^js node-factory node elements))

(defn create-binding-element
  (^js [node-factory]
   (.createBindingElement ^js node-factory))
  (^js [node-factory dot-dot-dot-token]
   (.createBindingElement ^js node-factory dot-dot-dot-token))
  (^js [node-factory dot-dot-dot-token property-name]
   (.createBindingElement ^js node-factory dot-dot-dot-token property-name))
  (^js [node-factory dot-dot-dot-token property-name name]
   (.createBindingElement ^js node-factory dot-dot-dot-token property-name name))
  (^js [node-factory dot-dot-dot-token property-name name initializer]
   (.createBindingElement ^js node-factory dot-dot-dot-token property-name name initializer)))

(defn update-binding-element
  (^js [node-factory node]
   (.updateBindingElement ^js node-factory node))
  (^js [node-factory node dot-dot-dot-token]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token))
  (^js [node-factory node dot-dot-dot-token property-name]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token property-name))
  (^js [node-factory node dot-dot-dot-token property-name name]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token property-name name))
  (^js [node-factory node dot-dot-dot-token property-name name initializer]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token property-name name initializer)))

(defn create-array-literal-expression
  (^js [node-factory]
   (.createArrayLiteralExpression ^js node-factory))
  (^js [node-factory elements]
   (.createArrayLiteralExpression ^js node-factory elements))
  (^js [node-factory elements multi-line?]
   (.createArrayLiteralExpression ^js node-factory elements multi-line?)))

(defn update-array-literal-expression
  ^js [node-factory node elements]
  (.updateArrayLiteralExpression ^js node-factory node elements))

(defn create-object-literal-expression
  (^js [node-factory]
   (.createObjectLiteralExpression ^js node-factory))
  (^js [node-factory properties]
   (.createObjectLiteralExpression ^js node-factory properties))
  (^js [node-factory properties multi-line?]
   (.createObjectLiteralExpression ^js node-factory properties multi-line?)))

(defn update-object-literal-expression
  ^js [node-factory node properties]
  (.updateObjectLiteralExpression ^js node-factory node properties))

(defn create-property-access-expression
  ^js [node-factory expression name]
  (.createPropertyAccessExpression ^js node-factory expression name))

(defn update-property-access-expression
  ^js [node-factory node expression name]
  (.updatePropertyAccessExpression ^js node-factory node expression name))

(defn create-property-access-chain
  (^js [node-factory expression]
   (.createPropertyAccessChain ^js node-factory expression))
  (^js [node-factory expression question-dot-token]
   (.createPropertyAccessChain ^js node-factory expression question-dot-token))
  (^js [node-factory expression question-dot-token name]
   (.createPropertyAccessChain ^js node-factory expression question-dot-token name)))

(defn update-property-access-chain
  (^js [node-factory node expression]
   (.updatePropertyAccessChain ^js node-factory node expression))
  (^js [node-factory node expression question-dot-token]
   (.updatePropertyAccessChain ^js node-factory node expression question-dot-token))
  (^js [node-factory node expression question-dot-token name]
   (.updatePropertyAccessChain ^js node-factory node expression question-dot-token name)))

(defn create-element-access-expression
  ^js [node-factory expression index]
  (.createElementAccessExpression ^js node-factory expression index))

(defn update-element-access-expression
  ^js [node-factory node expression argument-expression]
  (.updateElementAccessExpression ^js node-factory node expression argument-expression))

(defn create-element-access-chain
  (^js [node-factory expression]
   (.createElementAccessChain ^js node-factory expression))
  (^js [node-factory expression question-dot-token]
   (.createElementAccessChain ^js node-factory expression question-dot-token))
  (^js [node-factory expression question-dot-token index]
   (.createElementAccessChain ^js node-factory expression question-dot-token index)))

(defn update-element-access-chain
  (^js [node-factory node expression]
   (.updateElementAccessChain ^js node-factory node expression))
  (^js [node-factory node expression question-dot-token]
   (.updateElementAccessChain ^js node-factory node expression question-dot-token))
  (^js [node-factory node expression question-dot-token argument-expression]
   (.updateElementAccessChain ^js node-factory node expression question-dot-token argument-expression)))

(defn create-call-expression
  (^js [node-factory expression]
   (.createCallExpression ^js node-factory expression))
  (^js [node-factory expression type-arguments]
   (.createCallExpression ^js node-factory expression type-arguments))
  (^js [node-factory expression type-arguments arguments-array]
   (.createCallExpression ^js node-factory expression type-arguments arguments-array)))

(defn update-call-expression
  (^js [node-factory node expression]
   (.updateCallExpression ^js node-factory node expression))
  (^js [node-factory node expression type-arguments]
   (.updateCallExpression ^js node-factory node expression type-arguments))
  (^js [node-factory node expression type-arguments arguments-array]
   (.updateCallExpression ^js node-factory node expression type-arguments arguments-array)))

(defn create-call-chain
  (^js [node-factory expression]
   (.createCallChain ^js node-factory expression))
  (^js [node-factory expression question-dot-token]
   (.createCallChain ^js node-factory expression question-dot-token))
  (^js [node-factory expression question-dot-token type-arguments]
   (.createCallChain ^js node-factory expression question-dot-token type-arguments))
  (^js [node-factory expression question-dot-token type-arguments arguments-array]
   (.createCallChain ^js node-factory expression question-dot-token type-arguments arguments-array)))

(defn update-call-chain
  (^js [node-factory node expression]
   (.updateCallChain ^js node-factory node expression))
  (^js [node-factory node expression question-dot-token]
   (.updateCallChain ^js node-factory node expression question-dot-token))
  (^js [node-factory node expression question-dot-token type-arguments]
   (.updateCallChain ^js node-factory node expression question-dot-token type-arguments))
  (^js [node-factory node expression question-dot-token type-arguments arguments-array]
   (.updateCallChain ^js node-factory node expression question-dot-token type-arguments arguments-array)))

(defn create-new-expression
  (^js [node-factory expression]
   (.createNewExpression ^js node-factory expression))
  (^js [node-factory expression type-arguments]
   (.createNewExpression ^js node-factory expression type-arguments))
  (^js [node-factory expression type-arguments arguments-array]
   (.createNewExpression ^js node-factory expression type-arguments arguments-array)))

(defn update-new-expression
  (^js [node-factory node expression]
   (.updateNewExpression ^js node-factory node expression))
  (^js [node-factory node expression type-arguments]
   (.updateNewExpression ^js node-factory node expression type-arguments))
  (^js [node-factory node expression type-arguments arguments-array]
   (.updateNewExpression ^js node-factory node expression type-arguments arguments-array)))

(defn create-tagged-template-expression
  (^js [node-factory tag]
   (.createTaggedTemplateExpression ^js node-factory tag))
  (^js [node-factory tag type-arguments]
   (.createTaggedTemplateExpression ^js node-factory tag type-arguments))
  (^js [node-factory tag type-arguments template]
   (.createTaggedTemplateExpression ^js node-factory tag type-arguments template)))

(defn update-tagged-template-expression
  (^js [node-factory node tag]
   (.updateTaggedTemplateExpression ^js node-factory node tag))
  (^js [node-factory node tag type-arguments]
   (.updateTaggedTemplateExpression ^js node-factory node tag type-arguments))
  (^js [node-factory node tag type-arguments template]
   (.updateTaggedTemplateExpression ^js node-factory node tag type-arguments template)))

(defn create-type-assertion
  ^js [node-factory type expression]
  (.createTypeAssertion ^js node-factory type expression))

(defn update-type-assertion
  ^js [node-factory node type expression]
  (.updateTypeAssertion ^js node-factory node type expression))

(defn create-parenthesized-expression
  ^js [node-factory expression]
  (.createParenthesizedExpression ^js node-factory expression))

(defn update-parenthesized-expression
  ^js [node-factory node expression]
  (.updateParenthesizedExpression ^js node-factory node expression))

(defn create-function-expression
  (^js [node-factory]
   (.createFunctionExpression ^js node-factory))
  (^js [node-factory modifiers]
   (.createFunctionExpression ^js node-factory modifiers))
  (^js [node-factory modifiers asterisk-token]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token))
  (^js [node-factory modifiers asterisk-token name]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name))
  (^js [node-factory modifiers asterisk-token name type-parameters]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters parameters))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters parameters type))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-expression
  (^js [node-factory node]
   (.updateFunctionExpression ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateFunctionExpression ^js node-factory node modifiers))
  (^js [node-factory node modifiers asterisk-token]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token))
  (^js [node-factory node modifiers asterisk-token name]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name))
  (^js [node-factory node modifiers asterisk-token name type-parameters]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-arrow-function
  (^js [node-factory]
   (.createArrowFunction ^js node-factory))
  (^js [node-factory modifiers]
   (.createArrowFunction ^js node-factory modifiers))
  (^js [node-factory modifiers type-parameters]
   (.createArrowFunction ^js node-factory modifiers type-parameters))
  (^js [node-factory modifiers type-parameters parameters]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters))
  (^js [node-factory modifiers type-parameters parameters type]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters type))
  (^js [node-factory modifiers type-parameters parameters type equals-greater-than-token]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters type equals-greater-than-token))
  (^js [node-factory modifiers type-parameters parameters type equals-greater-than-token body]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters type equals-greater-than-token body)))

(defn update-arrow-function
  (^js [node-factory node]
   (.updateArrowFunction ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateArrowFunction ^js node-factory node modifiers))
  (^js [node-factory node modifiers type-parameters]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters))
  (^js [node-factory node modifiers type-parameters parameters]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters))
  (^js [node-factory node modifiers type-parameters parameters type]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters type))
  (^js [node-factory node modifiers type-parameters parameters type equals-greater-than-token]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters type equals-greater-than-token))
  (^js [node-factory node modifiers type-parameters parameters type equals-greater-than-token body]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters type equals-greater-than-token body)))

(defn create-delete-expression
  ^js [node-factory expression]
  (.createDeleteExpression ^js node-factory expression))

(defn update-delete-expression
  ^js [node-factory node expression]
  (.updateDeleteExpression ^js node-factory node expression))

(defn create-type-of-expression
  ^js [node-factory expression]
  (.createTypeOfExpression ^js node-factory expression))

(defn update-type-of-expression
  ^js [node-factory node expression]
  (.updateTypeOfExpression ^js node-factory node expression))

(defn create-void-expression
  ^js [node-factory expression]
  (.createVoidExpression ^js node-factory expression))

(defn update-void-expression
  ^js [node-factory node expression]
  (.updateVoidExpression ^js node-factory node expression))

(defn create-await-expression
  ^js [node-factory expression]
  (.createAwaitExpression ^js node-factory expression))

(defn update-await-expression
  ^js [node-factory node expression]
  (.updateAwaitExpression ^js node-factory node expression))

(defn create-prefix-unary-expression
  ^js [node-factory operator operand]
  (.createPrefixUnaryExpression ^js node-factory operator operand))

(defn update-prefix-unary-expression
  ^js [node-factory node operand]
  (.updatePrefixUnaryExpression ^js node-factory node operand))

(defn create-postfix-unary-expression
  ^js [node-factory operand operator]
  (.createPostfixUnaryExpression ^js node-factory operand operator))

(defn update-postfix-unary-expression
  ^js [node-factory node operand]
  (.updatePostfixUnaryExpression ^js node-factory node operand))

(defn create-binary-expression
  ^js [node-factory left operator right]
  (.createBinaryExpression ^js node-factory left operator right))

(defn update-binary-expression
  ^js [node-factory node left operator right]
  (.updateBinaryExpression ^js node-factory node left operator right))

(defn create-conditional-expression
  (^js [node-factory condition]
   (.createConditionalExpression ^js node-factory condition))
  (^js [node-factory condition question-token]
   (.createConditionalExpression ^js node-factory condition question-token))
  (^js [node-factory condition question-token when-true]
   (.createConditionalExpression ^js node-factory condition question-token when-true))
  (^js [node-factory condition question-token when-true colon-token]
   (.createConditionalExpression ^js node-factory condition question-token when-true colon-token))
  (^js [node-factory condition question-token when-true colon-token when-false]
   (.createConditionalExpression ^js node-factory condition question-token when-true colon-token when-false)))

(defn update-conditional-expression
  ^js [node-factory node condition question-token when-true colon-token when-false]
  (.updateConditionalExpression ^js node-factory node condition question-token when-true colon-token when-false))

(defn create-template-expression
  ^js [node-factory head template-spans]
  (.createTemplateExpression ^js node-factory head template-spans))

(defn update-template-expression
  ^js [node-factory node head template-spans]
  (.updateTemplateExpression ^js node-factory node head template-spans))

(defn create-template-head
  (^js [node-factory]
   (.createTemplateHead ^js node-factory))
  (^js [node-factory text]
   (.createTemplateHead ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createTemplateHead ^js node-factory text raw-text))
  (^js [node-factory text raw-text template-flags]
   (.createTemplateHead ^js node-factory text raw-text template-flags)))

(defn create-template-middle
  (^js [node-factory]
   (.createTemplateMiddle ^js node-factory))
  (^js [node-factory text]
   (.createTemplateMiddle ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createTemplateMiddle ^js node-factory text raw-text))
  (^js [node-factory text raw-text template-flags]
   (.createTemplateMiddle ^js node-factory text raw-text template-flags)))

(defn create-template-tail
  (^js [node-factory]
   (.createTemplateTail ^js node-factory))
  (^js [node-factory text]
   (.createTemplateTail ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createTemplateTail ^js node-factory text raw-text))
  (^js [node-factory text raw-text template-flags]
   (.createTemplateTail ^js node-factory text raw-text template-flags)))

(defn create-no-substitution-template-literal
  (^js [node-factory]
   (.createNoSubstitutionTemplateLiteral ^js node-factory))
  (^js [node-factory text]
   (.createNoSubstitutionTemplateLiteral ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createNoSubstitutionTemplateLiteral ^js node-factory text raw-text)))

(defn create-yield-expression
  (^js [node-factory]
   (.createYieldExpression ^js node-factory))
  (^js [node-factory asterisk-token]
   (.createYieldExpression ^js node-factory asterisk-token))
  (^js [node-factory asterisk-token expression]
   (.createYieldExpression ^js node-factory asterisk-token expression)))

(defn update-yield-expression
  (^js [node-factory node]
   (.updateYieldExpression ^js node-factory node))
  (^js [node-factory node asterisk-token]
   (.updateYieldExpression ^js node-factory node asterisk-token))
  (^js [node-factory node asterisk-token expression]
   (.updateYieldExpression ^js node-factory node asterisk-token expression)))

(defn create-spread-element
  ^js [node-factory expression]
  (.createSpreadElement ^js node-factory expression))

(defn update-spread-element
  ^js [node-factory node expression]
  (.updateSpreadElement ^js node-factory node expression))

(defn create-class-expression
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name type-parameters]
               [node-factory decorators modifiers name type-parameters heritage-clauses]
               [node-factory decorators modifiers name type-parameters heritage-clauses members]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name type-parameters]
               [node-factory modifiers name type-parameters heritage-clauses]
               [node-factory modifiers name type-parameters heritage-clauses members])}
  (^js [node-factory]
   (.createClassExpression ^js node-factory))
  (^js [a b]
   (.createClassExpression ^js a b))
  (^js [a b c]
   (.createClassExpression ^js a b c))
  (^js [a b c d]
   (.createClassExpression ^js a b c d))
  (^js [a b c d e]
   (.createClassExpression ^js a b c d e))
  (^js [a b c d e f]
   (.createClassExpression ^js a b c d e f))
  (^js [node-factory decorators modifiers name type-parameters heritage-clauses members]
   (.createClassExpression ^js node-factory decorators modifiers name type-parameters heritage-clauses members)))

(defn update-class-expression
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name type-parameters]
               [node-factory node decorators modifiers name type-parameters heritage-clauses]
               [node-factory node decorators modifiers name type-parameters heritage-clauses members]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name type-parameters]
               [node-factory node modifiers name type-parameters heritage-clauses]
               [node-factory node modifiers name type-parameters heritage-clauses members])}
  (^js [node-factory node]
   (.updateClassExpression ^js node-factory node))
  (^js [a b c]
   (.updateClassExpression ^js a b c))
  (^js [a b c d]
   (.updateClassExpression ^js a b c d))
  (^js [a b c d e]
   (.updateClassExpression ^js a b c d e))
  (^js [a b c d e f]
   (.updateClassExpression ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateClassExpression ^js a b c d e f g))
  (^js [node-factory node decorators modifiers name type-parameters heritage-clauses members]
   (.updateClassExpression ^js node-factory node decorators modifiers name type-parameters heritage-clauses members)))

(defn create-omitted-expression
  ^js [node-factory]
  (.createOmittedExpression ^js node-factory))

(defn create-expression-with-type-arguments
  (^js [node-factory expression]
   (.createExpressionWithTypeArguments ^js node-factory expression))
  (^js [node-factory expression type-arguments]
   (.createExpressionWithTypeArguments ^js node-factory expression type-arguments)))

(defn update-expression-with-type-arguments
  (^js [node-factory node expression]
   (.updateExpressionWithTypeArguments ^js node-factory node expression))
  (^js [node-factory node expression type-arguments]
   (.updateExpressionWithTypeArguments ^js node-factory node expression type-arguments)))

(defn create-as-expression
  ^js [node-factory expression type]
  (.createAsExpression ^js node-factory expression type))

(defn update-as-expression
  ^js [node-factory node expression type]
  (.updateAsExpression ^js node-factory node expression type))

(defn create-non-null-expression
  ^js [node-factory expression]
  (.createNonNullExpression ^js node-factory expression))

(defn update-non-null-expression
  ^js [node-factory node expression]
  (.updateNonNullExpression ^js node-factory node expression))

(defn create-non-null-chain
  ^js [node-factory expression]
  (.createNonNullChain ^js node-factory expression))

(defn update-non-null-chain
  ^js [node-factory node expression]
  (.updateNonNullChain ^js node-factory node expression))

(defn create-meta-property
  ^js [node-factory keyword-token name]
  (.createMetaProperty ^js node-factory keyword-token name))

(defn update-meta-property
  ^js [node-factory node name]
  (.updateMetaProperty ^js node-factory node name))

(defn create-template-span
  ^js [node-factory expression literal]
  (.createTemplateSpan ^js node-factory expression literal))

(defn update-template-span
  ^js [node-factory node expression literal]
  (.updateTemplateSpan ^js node-factory node expression literal))

(defn create-semicolon-class-element
  ^js [node-factory]
  (.createSemicolonClassElement ^js node-factory))

(defn create-block
  (^js [node-factory statements]
   (.createBlock ^js node-factory statements))
  (^js [node-factory statements multi-line?]
   (.createBlock ^js node-factory statements multi-line?)))

(defn update-block
  ^js [node-factory node statements]
  (.updateBlock ^js node-factory node statements))

(defn create-variable-statement
  (^js [node-factory]
   (.createVariableStatement ^js node-factory))
  (^js [node-factory modifiers]
   (.createVariableStatement ^js node-factory modifiers))
  (^js [node-factory modifiers declaration-list]
   (.createVariableStatement ^js node-factory modifiers declaration-list)))

(defn update-variable-statement
  (^js [node-factory node]
   (.updateVariableStatement ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateVariableStatement ^js node-factory node modifiers))
  (^js [node-factory node modifiers declaration-list]
   (.updateVariableStatement ^js node-factory node modifiers declaration-list)))

(defn create-empty-statement
  ^js [node-factory]
  (.createEmptyStatement ^js node-factory))

(defn create-expression-statement
  ^js [node-factory expression]
  (.createExpressionStatement ^js node-factory expression))

(defn update-expression-statement
  ^js [node-factory node expression]
  (.updateExpressionStatement ^js node-factory node expression))

(defn create-if-statement
  (^js [node-factory expression then-statement]
   (.createIfStatement ^js node-factory expression then-statement))
  (^js [node-factory expression then-statement else-statement]
   (.createIfStatement ^js node-factory expression then-statement else-statement)))

(defn update-if-statement
  (^js [node-factory node expression then-statement]
   (.updateIfStatement ^js node-factory node expression then-statement))
  (^js [node-factory node expression then-statement else-statement]
   (.updateIfStatement ^js node-factory node expression then-statement else-statement)))

(defn create-do-statement
  ^js [node-factory statement expression]
  (.createDoStatement ^js node-factory statement expression))

(defn update-do-statement
  ^js [node-factory node statement expression]
  (.updateDoStatement ^js node-factory node statement expression))

(defn create-while-statement
  ^js [node-factory expression statement]
  (.createWhileStatement ^js node-factory expression statement))

(defn update-while-statement
  ^js [node-factory node expression statement]
  (.updateWhileStatement ^js node-factory node expression statement))

(defn create-for-statement
  (^js [node-factory]
   (.createForStatement ^js node-factory))
  (^js [node-factory initializer]
   (.createForStatement ^js node-factory initializer))
  (^js [node-factory initializer condition]
   (.createForStatement ^js node-factory initializer condition))
  (^js [node-factory initializer condition incrementor]
   (.createForStatement ^js node-factory initializer condition incrementor))
  (^js [node-factory initializer condition incrementor statement]
   (.createForStatement ^js node-factory initializer condition incrementor statement)))

(defn update-for-statement
  (^js [node-factory node]
   (.updateForStatement ^js node-factory node))
  (^js [node-factory node initializer]
   (.updateForStatement ^js node-factory node initializer))
  (^js [node-factory node initializer condition]
   (.updateForStatement ^js node-factory node initializer condition))
  (^js [node-factory node initializer condition incrementor]
   (.updateForStatement ^js node-factory node initializer condition incrementor))
  (^js [node-factory node initializer condition incrementor statement]
   (.updateForStatement ^js node-factory node initializer condition incrementor statement)))

(defn create-for-in-statement
  ^js [node-factory initializer expression statement]
  (.createForInStatement ^js node-factory initializer expression statement))

(defn update-for-in-statement
  ^js [node-factory node initializer expression statement]
  (.updateForInStatement ^js node-factory node initializer expression statement))

(defn create-for-of-statement
  (^js [node-factory]
   (.createForOfStatement ^js node-factory))
  (^js [node-factory await-modifier]
   (.createForOfStatement ^js node-factory await-modifier))
  (^js [node-factory await-modifier initializer]
   (.createForOfStatement ^js node-factory await-modifier initializer))
  (^js [node-factory await-modifier initializer expression]
   (.createForOfStatement ^js node-factory await-modifier initializer expression))
  (^js [node-factory await-modifier initializer expression statement]
   (.createForOfStatement ^js node-factory await-modifier initializer expression statement)))

(defn update-for-of-statement
  (^js [node-factory node]
   (.updateForOfStatement ^js node-factory node))
  (^js [node-factory node await-modifier]
   (.updateForOfStatement ^js node-factory node await-modifier))
  (^js [node-factory node await-modifier initializer]
   (.updateForOfStatement ^js node-factory node await-modifier initializer))
  (^js [node-factory node await-modifier initializer expression]
   (.updateForOfStatement ^js node-factory node await-modifier initializer expression))
  (^js [node-factory node await-modifier initializer expression statement]
   (.updateForOfStatement ^js node-factory node await-modifier initializer expression statement)))

(defn create-continue-statement
  (^js [node-factory]
   (.createContinueStatement ^js node-factory))
  (^js [node-factory label]
   (.createContinueStatement ^js node-factory label)))

(defn update-continue-statement
  (^js [node-factory node]
   (.updateContinueStatement ^js node-factory node))
  (^js [node-factory node label]
   (.updateContinueStatement ^js node-factory node label)))

(defn create-break-statement
  (^js [node-factory]
   (.createBreakStatement ^js node-factory))
  (^js [node-factory label]
   (.createBreakStatement ^js node-factory label)))

(defn update-break-statement
  (^js [node-factory node]
   (.updateBreakStatement ^js node-factory node))
  (^js [node-factory node label]
   (.updateBreakStatement ^js node-factory node label)))

(defn create-return-statement
  (^js [node-factory]
   (.createReturnStatement ^js node-factory))
  (^js [node-factory expression]
   (.createReturnStatement ^js node-factory expression)))

(defn update-return-statement
  (^js [node-factory node]
   (.updateReturnStatement ^js node-factory node))
  (^js [node-factory node expression]
   (.updateReturnStatement ^js node-factory node expression)))

(defn create-with-statement
  ^js [node-factory expression statement]
  (.createWithStatement ^js node-factory expression statement))

(defn update-with-statement
  ^js [node-factory node expression statement]
  (.updateWithStatement ^js node-factory node expression statement))

(defn create-switch-statement
  ^js [node-factory expression case-block]
  (.createSwitchStatement ^js node-factory expression case-block))

(defn update-switch-statement
  ^js [node-factory node expression case-block]
  (.updateSwitchStatement ^js node-factory node expression case-block))

(defn create-labeled-statement
  ^js [node-factory label statement]
  (.createLabeledStatement ^js node-factory label statement))

(defn update-labeled-statement
  ^js [node-factory node label statement]
  (.updateLabeledStatement ^js node-factory node label statement))

(defn create-throw-statement
  ^js [node-factory expression]
  (.createThrowStatement ^js node-factory expression))

(defn update-throw-statement
  ^js [node-factory node expression]
  (.updateThrowStatement ^js node-factory node expression))

(defn create-try-statement
  (^js [node-factory try-block]
   (.createTryStatement ^js node-factory try-block))
  (^js [node-factory try-block catch-clause]
   (.createTryStatement ^js node-factory try-block catch-clause))
  (^js [node-factory try-block catch-clause finally-block]
   (.createTryStatement ^js node-factory try-block catch-clause finally-block)))

(defn update-try-statement
  (^js [node-factory node try-block]
   (.updateTryStatement ^js node-factory node try-block))
  (^js [node-factory node try-block catch-clause]
   (.updateTryStatement ^js node-factory node try-block catch-clause))
  (^js [node-factory node try-block catch-clause finally-block]
   (.updateTryStatement ^js node-factory node try-block catch-clause finally-block)))

(defn create-debugger-statement
  ^js [node-factory]
  (.createDebuggerStatement ^js node-factory))

(defn create-variable-declaration
  (^js [node-factory name]
   (.createVariableDeclaration ^js node-factory name))
  (^js [node-factory name exclamation-token]
   (.createVariableDeclaration ^js node-factory name exclamation-token))
  (^js [node-factory name exclamation-token type]
   (.createVariableDeclaration ^js node-factory name exclamation-token type))
  (^js [node-factory name exclamation-token type initializer]
   (.createVariableDeclaration ^js node-factory name exclamation-token type initializer)))

(defn update-variable-declaration
  (^js [node-factory node name]
   (.updateVariableDeclaration ^js node-factory node name))
  (^js [node-factory node name exclamation-token]
   (.updateVariableDeclaration ^js node-factory node name exclamation-token))
  (^js [node-factory node name exclamation-token type]
   (.updateVariableDeclaration ^js node-factory node name exclamation-token type))
  (^js [node-factory node name exclamation-token type initializer]
   (.updateVariableDeclaration ^js node-factory node name exclamation-token type initializer)))

(defn create-variable-declaration-list
  (^js [node-factory declarations]
   (.createVariableDeclarationList ^js node-factory declarations))
  (^js [node-factory declarations flags]
   (.createVariableDeclarationList ^js node-factory declarations flags)))

(defn update-variable-declaration-list
  ^js [node-factory node declarations]
  (.updateVariableDeclarationList ^js node-factory node declarations))

(defn create-function-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers asterisk-token]
               [node-factory decorators modifiers asterisk-token name]
               [node-factory decorators modifiers asterisk-token name type-parameters]
               [node-factory decorators modifiers asterisk-token name type-parameters parameters]
               [node-factory decorators modifiers asterisk-token name type-parameters parameters type]
               [node-factory decorators modifiers asterisk-token name type-parameters parameters type body]
               [node-factory modifiers]
               [node-factory modifiers asterisk-token]
               [node-factory modifiers asterisk-token name]
               [node-factory modifiers asterisk-token name type-parameters]
               [node-factory modifiers asterisk-token name type-parameters parameters]
               [node-factory modifiers asterisk-token name type-parameters parameters type]
               [node-factory modifiers asterisk-token name type-parameters parameters type body])}
  (^js [node-factory]
   (.createFunctionDeclaration ^js node-factory))
  (^js [a b]
   (.createFunctionDeclaration ^js a b))
  (^js [a b c]
   (.createFunctionDeclaration ^js a b c))
  (^js [a b c d]
   (.createFunctionDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createFunctionDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createFunctionDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.createFunctionDeclaration ^js a b c d e f g))
  (^js [a b c d e f g h]
   (.createFunctionDeclaration ^js a b c d e f g h))
  (^js [node-factory decorators modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionDeclaration ^js node-factory decorators modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers asterisk-token]
               [node-factory node decorators modifiers asterisk-token name]
               [node-factory node decorators modifiers asterisk-token name type-parameters]
               [node-factory node decorators modifiers asterisk-token name type-parameters parameters]
               [node-factory node decorators modifiers asterisk-token name type-parameters parameters type]
               [node-factory node decorators modifiers asterisk-token name type-parameters parameters type body]
               [node-factory node modifiers]
               [node-factory node modifiers asterisk-token]
               [node-factory node modifiers asterisk-token name]
               [node-factory node modifiers asterisk-token name type-parameters]
               [node-factory node modifiers asterisk-token name type-parameters parameters]
               [node-factory node modifiers asterisk-token name type-parameters parameters type]
               [node-factory node modifiers asterisk-token name type-parameters parameters type body])}
  (^js [node-factory node]
   (.updateFunctionDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateFunctionDeclaration ^js a b c))
  (^js [a b c d]
   (.updateFunctionDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateFunctionDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateFunctionDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateFunctionDeclaration ^js a b c d e f g))
  (^js [a b c d e f g h]
   (.updateFunctionDeclaration ^js a b c d e f g h))
  (^js [a b c d e f g h i]
   (.updateFunctionDeclaration ^js a b c d e f g h i))
  (^js [node-factory node decorators modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionDeclaration ^js node-factory node decorators modifiers asterisk-token name type-parameters parameters type body)))

(defn create-class-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name type-parameters]
               [node-factory decorators modifiers name type-parameters heritage-clauses]
               [node-factory decorators modifiers name type-parameters heritage-clauses members]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name type-parameters]
               [node-factory modifiers name type-parameters heritage-clauses]
               [node-factory modifiers name type-parameters heritage-clauses members])}
  (^js [node-factory]
   (.createClassDeclaration ^js node-factory))
  (^js [a b]
   (.createClassDeclaration ^js a b))
  (^js [a b c]
   (.createClassDeclaration ^js a b c))
  (^js [a b c d]
   (.createClassDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createClassDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createClassDeclaration ^js a b c d e f))
  (^js [node-factory decorators modifiers name type-parameters heritage-clauses members]
   (.createClassDeclaration ^js node-factory decorators modifiers name type-parameters heritage-clauses members)))

(defn update-class-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name type-parameters]
               [node-factory node decorators modifiers name type-parameters heritage-clauses]
               [node-factory node decorators modifiers name type-parameters heritage-clauses members]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name type-parameters]
               [node-factory node modifiers name type-parameters heritage-clauses]
               [node-factory node modifiers name type-parameters heritage-clauses members])}
  (^js [node-factory node]
   (.updateClassDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateClassDeclaration ^js a b c))
  (^js [a b c d]
   (.updateClassDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateClassDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateClassDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateClassDeclaration ^js a b c d e f g))
  (^js [node-factory node decorators modifiers name type-parameters heritage-clauses members]
   (.updateClassDeclaration ^js node-factory node decorators modifiers name type-parameters heritage-clauses members)))

(defn create-interface-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name type-parameters]
               [node-factory decorators modifiers name type-parameters heritage-clauses]
               [node-factory decorators modifiers name type-parameters heritage-clauses members]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name type-parameters]
               [node-factory modifiers name type-parameters heritage-clauses]
               [node-factory modifiers name type-parameters heritage-clauses members])}
  (^js [node-factory]
   (.createInterfaceDeclaration ^js node-factory))
  (^js [a b]
   (.createInterfaceDeclaration ^js a b))
  (^js [a b c]
   (.createInterfaceDeclaration ^js a b c))
  (^js [a b c d]
   (.createInterfaceDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createInterfaceDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createInterfaceDeclaration ^js a b c d e f))
  (^js [node-factory decorators modifiers name type-parameters heritage-clauses members]
   (.createInterfaceDeclaration ^js node-factory decorators modifiers name type-parameters heritage-clauses members)))

(defn update-interface-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name type-parameters]
               [node-factory node decorators modifiers name type-parameters heritage-clauses]
               [node-factory node decorators modifiers name type-parameters heritage-clauses members]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name type-parameters]
               [node-factory node modifiers name type-parameters heritage-clauses]
               [node-factory node modifiers name type-parameters heritage-clauses members])}
  (^js [node-factory node]
   (.updateInterfaceDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateInterfaceDeclaration ^js a b c))
  (^js [a b c d]
   (.updateInterfaceDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateInterfaceDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateInterfaceDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateInterfaceDeclaration ^js a b c d e f g))
  (^js [node-factory node decorators modifiers name type-parameters heritage-clauses members]
   (.updateInterfaceDeclaration ^js node-factory node decorators modifiers name type-parameters heritage-clauses members)))

(defn create-type-alias-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name type-parameters]
               [node-factory decorators modifiers name type-parameters type]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name type-parameters]
               [node-factory modifiers name type-parameters type])}
  (^js [node-factory]
   (.createTypeAliasDeclaration ^js node-factory))
  (^js [a b]
   (.createTypeAliasDeclaration ^js a b))
  (^js [a b c]
   (.createTypeAliasDeclaration ^js a b c))
  (^js [a b c d]
   (.createTypeAliasDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createTypeAliasDeclaration ^js a b c d e))
  (^js [node-factory decorators modifiers name type-parameters type]
   (.createTypeAliasDeclaration ^js node-factory decorators modifiers name type-parameters type)))

(defn update-type-alias-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name type-parameters]
               [node-factory node decorators modifiers name type-parameters type]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name type-parameters]
               [node-factory node modifiers name type-parameters type])}
  (^js [node-factory node]
   (.updateTypeAliasDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateTypeAliasDeclaration ^js a b c))
  (^js [a b c d]
   (.updateTypeAliasDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateTypeAliasDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateTypeAliasDeclaration ^js a b c d e f))
  (^js [node-factory node decorators modifiers name type-parameters type]
   (.updateTypeAliasDeclaration ^js node-factory node decorators modifiers name type-parameters type)))

(defn create-enum-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name members]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name members])}
  (^js [node-factory]
   (.createEnumDeclaration ^js node-factory))
  (^js [a b]
   (.createEnumDeclaration ^js a b))
  (^js [a b c]
   (.createEnumDeclaration ^js a b c))
  (^js [a b c d]
   (.createEnumDeclaration ^js a b c d))
  (^js [node-factory decorators modifiers name members]
   (.createEnumDeclaration ^js node-factory decorators modifiers name members)))

(defn update-enum-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name members]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name members])}
  (^js [node-factory node]
   (.updateEnumDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateEnumDeclaration ^js a b c))
  (^js [a b c d]
   (.updateEnumDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateEnumDeclaration ^js a b c d e))
  (^js [node-factory node decorators modifiers name members]
   (.updateEnumDeclaration ^js node-factory node decorators modifiers name members)))

(defn create-module-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers name]
               [node-factory decorators modifiers name body]
               [node-factory decorators modifiers name body flags]
               [node-factory modifiers]
               [node-factory modifiers name]
               [node-factory modifiers name body]
               [node-factory modifiers name body flags])}
  (^js [node-factory]
   (.createModuleDeclaration ^js node-factory))
  (^js [a b]
   (.createModuleDeclaration ^js a b))
  (^js [a b c]
   (.createModuleDeclaration ^js a b c))
  (^js [a b c d]
   (.createModuleDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createModuleDeclaration ^js a b c d e))
  (^js [node-factory decorators modifiers name body flags]
   (.createModuleDeclaration ^js node-factory decorators modifiers name body flags)))

(defn update-module-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers name]
               [node-factory node decorators modifiers name body]
               [node-factory node modifiers]
               [node-factory node modifiers name]
               [node-factory node modifiers name body])}
  (^js [node-factory node]
   (.updateModuleDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateModuleDeclaration ^js a b c))
  (^js [a b c d]
   (.updateModuleDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateModuleDeclaration ^js a b c d e))
  (^js [node-factory node decorators modifiers name body]
   (.updateModuleDeclaration ^js node-factory node decorators modifiers name body)))

(defn create-module-block
  ^js [node-factory statements]
  (.createModuleBlock ^js node-factory statements))

(defn update-module-block
  ^js [node-factory node statements]
  (.updateModuleBlock ^js node-factory node statements))

(defn create-case-block
  ^js [node-factory clauses]
  (.createCaseBlock ^js node-factory clauses))

(defn update-case-block
  ^js [node-factory node clauses]
  (.updateCaseBlock ^js node-factory node clauses))

(defn create-namespace-export-declaration
  ^js [node-factory name]
  (.createNamespaceExportDeclaration ^js node-factory name))

(defn update-namespace-export-declaration
  ^js [node-factory node name]
  (.updateNamespaceExportDeclaration ^js node-factory node name))

(defn create-import-equals-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers type-only?]
               [node-factory decorators modifiers type-only? name]
               [node-factory decorators modifiers type-only? name module-reference]
               [node-factory modifiers]
               [node-factory modifiers type-only?]
               [node-factory modifiers type-only? name]
               [node-factory modifiers type-only? name module-reference])}
  (^js [node-factory]
   (.createImportEqualsDeclaration ^js node-factory))
  (^js [a b]
   (.createImportEqualsDeclaration ^js a b))
  (^js [a b c]
   (.createImportEqualsDeclaration ^js a b c))
  (^js [a b c d]
   (.createImportEqualsDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createImportEqualsDeclaration ^js a b c d e))
  (^js [node-factory decorators modifiers type-only? name module-reference]
   (.createImportEqualsDeclaration ^js node-factory decorators modifiers type-only? name module-reference)))

(defn update-import-equals-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers type-only?]
               [node-factory node decorators modifiers type-only? name]
               [node-factory node decorators modifiers type-only? name module-reference]
               [node-factory node modifiers]
               [node-factory node modifiers type-only?]
               [node-factory node modifiers type-only? name]
               [node-factory node modifiers type-only? name module-reference])}
  (^js [node-factory node]
   (.updateImportEqualsDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateImportEqualsDeclaration ^js a b c))
  (^js [a b c d]
   (.updateImportEqualsDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateImportEqualsDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateImportEqualsDeclaration ^js a b c d e f))
  (^js [node-factory node decorators modifiers type-only? name module-reference]
   (.updateImportEqualsDeclaration ^js node-factory node decorators modifiers type-only? name module-reference)))

(defn create-import-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers import-clause]
               [node-factory decorators modifiers import-clause module-specifier]
               [node-factory decorators modifiers import-clause module-specifier assert-clause]
               [node-factory modifiers]
               [node-factory modifiers import-clause]
               [node-factory modifiers import-clause module-specifier]
               [node-factory modifiers import-clause module-specifier assert-clause])}
  (^js [node-factory]
   (.createImportDeclaration ^js node-factory))
  (^js [a b]
   (.createImportDeclaration ^js a b))
  (^js [a b c]
   (.createImportDeclaration ^js a b c))
  (^js [a b c d]
   (.createImportDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createImportDeclaration ^js a b c d e))
  (^js [node-factory decorators modifiers import-clause module-specifier assert-clause]
   (.createImportDeclaration ^js node-factory decorators modifiers import-clause module-specifier assert-clause)))

(defn update-import-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers import-clause]
               [node-factory node decorators modifiers import-clause module-specifier]
               [node-factory node decorators modifiers import-clause module-specifier assert-clause]
               [node-factory node modifiers]
               [node-factory node modifiers import-clause]
               [node-factory node modifiers import-clause module-specifier]
               [node-factory node modifiers import-clause module-specifier assert-clause])}
  (^js [node-factory node]
   (.updateImportDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateImportDeclaration ^js a b c))
  (^js [a b c d]
   (.updateImportDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateImportDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateImportDeclaration ^js a b c d e f))
  (^js [node-factory node decorators modifiers import-clause module-specifier assert-clause]
   (.updateImportDeclaration ^js node-factory node decorators modifiers import-clause module-specifier assert-clause)))

(defn create-import-clause
  (^js [node-factory type-only?]
   (.createImportClause ^js node-factory type-only?))
  (^js [node-factory type-only? name]
   (.createImportClause ^js node-factory type-only? name))
  (^js [node-factory type-only? name named-bindings]
   (.createImportClause ^js node-factory type-only? name named-bindings)))

(defn update-import-clause
  (^js [node-factory node type-only?]
   (.updateImportClause ^js node-factory node type-only?))
  (^js [node-factory node type-only? name]
   (.updateImportClause ^js node-factory node type-only? name))
  (^js [node-factory node type-only? name named-bindings]
   (.updateImportClause ^js node-factory node type-only? name named-bindings)))

(defn create-assert-clause
  (^js [node-factory elements]
   (.createAssertClause ^js node-factory elements))
  (^js [node-factory elements multi-line?]
   (.createAssertClause ^js node-factory elements multi-line?)))

(defn update-assert-clause
  (^js [node-factory node elements]
   (.updateAssertClause ^js node-factory node elements))
  (^js [node-factory node elements multi-line?]
   (.updateAssertClause ^js node-factory node elements multi-line?)))

(defn create-assert-entry
  ^js [node-factory name value]
  (.createAssertEntry ^js node-factory name value))

(defn update-assert-entry
  ^js [node-factory node name value]
  (.updateAssertEntry ^js node-factory node name value))

(defn create-import-type-assertion-container
  (^js [node-factory clause]
   (.createImportTypeAssertionContainer ^js node-factory clause))
  (^js [node-factory clause multi-line?]
   (.createImportTypeAssertionContainer ^js node-factory clause multi-line?)))

(defn update-import-type-assertion-container
  (^js [node-factory node clause]
   (.updateImportTypeAssertionContainer ^js node-factory node clause))
  (^js [node-factory node clause multi-line?]
   (.updateImportTypeAssertionContainer ^js node-factory node clause multi-line?)))

(defn create-namespace-import
  ^js [node-factory name]
  (.createNamespaceImport ^js node-factory name))

(defn update-namespace-import
  ^js [node-factory node name]
  (.updateNamespaceImport ^js node-factory node name))

(defn create-namespace-export
  ^js [node-factory name]
  (.createNamespaceExport ^js node-factory name))

(defn update-namespace-export
  ^js [node-factory node name]
  (.updateNamespaceExport ^js node-factory node name))

(defn create-named-imports
  ^js [node-factory elements]
  (.createNamedImports ^js node-factory elements))

(defn update-named-imports
  ^js [node-factory node elements]
  (.updateNamedImports ^js node-factory node elements))

(defn create-import-specifier
  (^js [node-factory type-only?]
   (.createImportSpecifier ^js node-factory type-only?))
  (^js [node-factory type-only? property-name]
   (.createImportSpecifier ^js node-factory type-only? property-name))
  (^js [node-factory type-only? property-name name]
   (.createImportSpecifier ^js node-factory type-only? property-name name)))

(defn update-import-specifier
  (^js [node-factory node type-only?]
   (.updateImportSpecifier ^js node-factory node type-only?))
  (^js [node-factory node type-only? property-name]
   (.updateImportSpecifier ^js node-factory node type-only? property-name))
  (^js [node-factory node type-only? property-name name]
   (.updateImportSpecifier ^js node-factory node type-only? property-name name)))

(defn create-export-assignment
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers export-equals?]
               [node-factory decorators modifiers export-equals? expression]
               [node-factory modifiers]
               [node-factory modifiers export-equals?]
               [node-factory modifiers export-equals? expression])}
  (^js [node-factory]
   (.createExportAssignment ^js node-factory))
  (^js [a b]
   (.createExportAssignment ^js a b))
  (^js [a b c]
   (.createExportAssignment ^js a b c))
  (^js [a b c d]
   (.createExportAssignment ^js a b c d))
  (^js [node-factory decorators modifiers export-equals? expression]
   (.createExportAssignment ^js node-factory decorators modifiers export-equals? expression)))

(defn update-export-assignment
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers expression]
               [node-factory node modifiers]
               [node-factory node modifiers expression])}
  (^js [node-factory node]
   (.updateExportAssignment ^js node-factory node))
  (^js [a b c]
   (.updateExportAssignment ^js a b c))
  (^js [a b c d]
   (.updateExportAssignment ^js a b c d))
  (^js [node-factory node decorators modifiers expression]
   (.updateExportAssignment ^js node-factory node decorators modifiers expression)))

(defn create-export-declaration
  {:arglists '([node-factory]
               [node-factory decorators]
               [node-factory decorators modifiers]
               [node-factory decorators modifiers type-only?]
               [node-factory decorators modifiers type-only? export-clause]
               [node-factory decorators modifiers type-only? export-clause module-specifier]
               [node-factory decorators modifiers type-only? export-clause module-specifier assert-clause]
               [node-factory modifiers]
               [node-factory modifiers type-only?]
               [node-factory modifiers type-only? export-clause]
               [node-factory modifiers type-only? export-clause module-specifier]
               [node-factory modifiers type-only? export-clause module-specifier assert-clause])}
  (^js [node-factory]
   (.createExportDeclaration ^js node-factory))
  (^js [a b]
   (.createExportDeclaration ^js a b))
  (^js [a b c]
   (.createExportDeclaration ^js a b c))
  (^js [a b c d]
   (.createExportDeclaration ^js a b c d))
  (^js [a b c d e]
   (.createExportDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.createExportDeclaration ^js a b c d e f))
  (^js [node-factory decorators modifiers type-only? export-clause module-specifier assert-clause]
   (.createExportDeclaration ^js node-factory decorators modifiers type-only? export-clause module-specifier assert-clause)))

(defn update-export-declaration
  {:arglists '([node-factory node]
               [node-factory node decorators]
               [node-factory node decorators modifiers]
               [node-factory node decorators modifiers type-only?]
               [node-factory node decorators modifiers type-only? export-clause]
               [node-factory node decorators modifiers type-only? export-clause module-specifier]
               [node-factory node decorators modifiers type-only? export-clause module-specifier assert-clause]
               [node-factory node modifiers]
               [node-factory node modifiers type-only?]
               [node-factory node modifiers type-only? export-clause]
               [node-factory node modifiers type-only? export-clause module-specifier]
               [node-factory node modifiers type-only? export-clause module-specifier assert-clause])}
  (^js [node-factory node]
   (.updateExportDeclaration ^js node-factory node))
  (^js [a b c]
   (.updateExportDeclaration ^js a b c))
  (^js [a b c d]
   (.updateExportDeclaration ^js a b c d))
  (^js [a b c d e]
   (.updateExportDeclaration ^js a b c d e))
  (^js [a b c d e f]
   (.updateExportDeclaration ^js a b c d e f))
  (^js [a b c d e f g]
   (.updateExportDeclaration ^js a b c d e f g))
  (^js [node-factory node decorators modifiers type-only? export-clause module-specifier assert-clause]
   (.updateExportDeclaration ^js node-factory node decorators modifiers type-only? export-clause module-specifier assert-clause)))

(defn create-named-exports
  ^js [node-factory elements]
  (.createNamedExports ^js node-factory elements))

(defn update-named-exports
  ^js [node-factory node elements]
  (.updateNamedExports ^js node-factory node elements))

(defn create-export-specifier
  (^js [node-factory type-only?]
   (.createExportSpecifier ^js node-factory type-only?))
  (^js [node-factory type-only? property-name]
   (.createExportSpecifier ^js node-factory type-only? property-name))
  (^js [node-factory type-only? property-name name]
   (.createExportSpecifier ^js node-factory type-only? property-name name)))

(defn update-export-specifier
  (^js [node-factory node type-only?]
   (.updateExportSpecifier ^js node-factory node type-only?))
  (^js [node-factory node type-only? property-name]
   (.updateExportSpecifier ^js node-factory node type-only? property-name))
  (^js [node-factory node type-only? property-name name]
   (.updateExportSpecifier ^js node-factory node type-only? property-name name)))

(defn create-external-module-reference
  ^js [node-factory expression]
  (.createExternalModuleReference ^js node-factory expression))

(defn update-external-module-reference
  ^js [node-factory node expression]
  (.updateExternalModuleReference ^js node-factory node expression))

(defn create-js-doc-all-type
  ^js [node-factory]
  (.createJSDocAllType ^js node-factory))

(defn create-js-doc-unknown-type
  ^js [node-factory]
  (.createJSDocUnknownType ^js node-factory))

(defn create-js-doc-non-nullable-type
  (^js [node-factory type]
   (.createJSDocNonNullableType ^js node-factory type))
  (^js [node-factory type postfix?]
   (.createJSDocNonNullableType ^js node-factory type postfix?)))

(defn update-js-doc-non-nullable-type
  ^js [node-factory node type]
  (.updateJSDocNonNullableType ^js node-factory node type))

(defn create-js-doc-nullable-type
  (^js [node-factory type]
   (.createJSDocNullableType ^js node-factory type))
  (^js [node-factory type postfix?]
   (.createJSDocNullableType ^js node-factory type postfix?)))

(defn update-js-doc-nullable-type
  ^js [node-factory node type]
  (.updateJSDocNullableType ^js node-factory node type))

(defn create-js-doc-optional-type
  ^js [node-factory type]
  (.createJSDocOptionalType ^js node-factory type))

(defn update-js-doc-optional-type
  ^js [node-factory node type]
  (.updateJSDocOptionalType ^js node-factory node type))

(defn create-js-doc-function-type
  (^js [node-factory parameters]
   (.createJSDocFunctionType ^js node-factory parameters))
  (^js [node-factory parameters type]
   (.createJSDocFunctionType ^js node-factory parameters type)))

(defn update-js-doc-function-type
  (^js [node-factory node parameters]
   (.updateJSDocFunctionType ^js node-factory node parameters))
  (^js [node-factory node parameters type]
   (.updateJSDocFunctionType ^js node-factory node parameters type)))

(defn create-js-doc-variadic-type
  ^js [node-factory type]
  (.createJSDocVariadicType ^js node-factory type))

(defn update-js-doc-variadic-type
  ^js [node-factory node type]
  (.updateJSDocVariadicType ^js node-factory node type))

(defn create-js-doc-namepath-type
  ^js [node-factory type]
  (.createJSDocNamepathType ^js node-factory type))

(defn update-js-doc-namepath-type
  ^js [node-factory node type]
  (.updateJSDocNamepathType ^js node-factory node type))

(defn create-js-doc-type-expression
  ^js [node-factory type]
  (.createJSDocTypeExpression ^js node-factory type))

(defn update-js-doc-type-expression
  ^js [node-factory node type]
  (.updateJSDocTypeExpression ^js node-factory node type))

(defn create-js-doc-name-reference
  ^js [node-factory name]
  (.createJSDocNameReference ^js node-factory name))

(defn update-js-doc-name-reference
  ^js [node-factory node name]
  (.updateJSDocNameReference ^js node-factory node name))

(defn create-js-doc-member-name
  ^js [node-factory left right]
  (.createJSDocMemberName ^js node-factory left right))

(defn update-js-doc-member-name
  ^js [node-factory node left right]
  (.updateJSDocMemberName ^js node-factory node left right))

(defn create-js-doc-link
  (^js [node-factory]
   (.createJSDocLink ^js node-factory))
  (^js [node-factory name]
   (.createJSDocLink ^js node-factory name))
  (^js [node-factory name text]
   (.createJSDocLink ^js node-factory name text)))

(defn update-js-doc-link
  (^js [node-factory node]
   (.updateJSDocLink ^js node-factory node))
  (^js [node-factory node name]
   (.updateJSDocLink ^js node-factory node name))
  (^js [node-factory node name text]
   (.updateJSDocLink ^js node-factory node name text)))

(defn create-js-doc-link-code
  (^js [node-factory]
   (.createJSDocLinkCode ^js node-factory))
  (^js [node-factory name]
   (.createJSDocLinkCode ^js node-factory name))
  (^js [node-factory name text]
   (.createJSDocLinkCode ^js node-factory name text)))

(defn update-js-doc-link-code
  (^js [node-factory node]
   (.updateJSDocLinkCode ^js node-factory node))
  (^js [node-factory node name]
   (.updateJSDocLinkCode ^js node-factory node name))
  (^js [node-factory node name text]
   (.updateJSDocLinkCode ^js node-factory node name text)))

(defn create-js-doc-link-plain
  (^js [node-factory]
   (.createJSDocLinkPlain ^js node-factory))
  (^js [node-factory name]
   (.createJSDocLinkPlain ^js node-factory name))
  (^js [node-factory name text]
   (.createJSDocLinkPlain ^js node-factory name text)))

(defn update-js-doc-link-plain
  (^js [node-factory node]
   (.updateJSDocLinkPlain ^js node-factory node))
  (^js [node-factory node name]
   (.updateJSDocLinkPlain ^js node-factory node name))
  (^js [node-factory node name text]
   (.updateJSDocLinkPlain ^js node-factory node name text)))

(defn create-js-doc-type-literal
  (^js [node-factory]
   (.createJSDocTypeLiteral ^js node-factory))
  (^js [node-factory js-doc-property-tags]
   (.createJSDocTypeLiteral ^js node-factory js-doc-property-tags))
  (^js [node-factory js-doc-property-tags array-type?]
   (.createJSDocTypeLiteral ^js node-factory js-doc-property-tags array-type?)))

(defn update-js-doc-type-literal
  (^js [node-factory node]
   (.updateJSDocTypeLiteral ^js node-factory node))
  (^js [node-factory node js-doc-property-tags]
   (.updateJSDocTypeLiteral ^js node-factory node js-doc-property-tags))
  (^js [node-factory node js-doc-property-tags array-type?]
   (.updateJSDocTypeLiteral ^js node-factory node js-doc-property-tags array-type?)))

(defn create-js-doc-signature
  (^js [node-factory]
   (.createJSDocSignature ^js node-factory))
  (^js [node-factory type-parameters]
   (.createJSDocSignature ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createJSDocSignature ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createJSDocSignature ^js node-factory type-parameters parameters type)))

(defn update-js-doc-signature
  (^js [node-factory node]
   (.updateJSDocSignature ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateJSDocSignature ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateJSDocSignature ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateJSDocSignature ^js node-factory node type-parameters parameters type)))

(defn create-js-doc-template-tag
  (^js [node-factory]
   (.createJSDocTemplateTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocTemplateTag ^js node-factory tag-name))
  (^js [node-factory tag-name constraint]
   (.createJSDocTemplateTag ^js node-factory tag-name constraint))
  (^js [node-factory tag-name constraint type-parameters]
   (.createJSDocTemplateTag ^js node-factory tag-name constraint type-parameters))
  (^js [node-factory tag-name constraint type-parameters comment]
   (.createJSDocTemplateTag ^js node-factory tag-name constraint type-parameters comment)))

(defn update-js-doc-template-tag
  (^js [node-factory node]
   (.updateJSDocTemplateTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocTemplateTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name constraint]
   (.updateJSDocTemplateTag ^js node-factory node tag-name constraint))
  (^js [node-factory node tag-name constraint type-parameters]
   (.updateJSDocTemplateTag ^js node-factory node tag-name constraint type-parameters))
  (^js [node-factory node tag-name constraint type-parameters comment]
   (.updateJSDocTemplateTag ^js node-factory node tag-name constraint type-parameters comment)))

(defn create-js-doc-typedef-tag
  (^js [node-factory]
   (.createJSDocTypedefTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocTypedefTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocTypedefTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression full-name]
   (.createJSDocTypedefTag ^js node-factory tag-name type-expression full-name))
  (^js [node-factory tag-name type-expression full-name comment]
   (.createJSDocTypedefTag ^js node-factory tag-name type-expression full-name comment)))

(defn update-js-doc-typedef-tag
  (^js [node-factory node]
   (.updateJSDocTypedefTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocTypedefTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocTypedefTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression full-name]
   (.updateJSDocTypedefTag ^js node-factory node tag-name type-expression full-name))
  (^js [node-factory node tag-name type-expression full-name comment]
   (.updateJSDocTypedefTag ^js node-factory node tag-name type-expression full-name comment)))

(defn create-js-doc-parameter-tag
  (^js [node-factory]
   (.createJSDocParameterTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocParameterTag ^js node-factory tag-name))
  (^js [node-factory tag-name name]
   (.createJSDocParameterTag ^js node-factory tag-name name))
  (^js [node-factory tag-name name bracketed?]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed?))
  (^js [node-factory tag-name name bracketed? type-expression]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed? type-expression))
  (^js [node-factory tag-name name bracketed? type-expression name-first?]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed? type-expression name-first?))
  (^js [node-factory tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed? type-expression name-first? comment)))

(defn update-js-doc-parameter-tag
  (^js [node-factory node]
   (.updateJSDocParameterTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocParameterTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name name]
   (.updateJSDocParameterTag ^js node-factory node tag-name name))
  (^js [node-factory node tag-name name bracketed?]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed?))
  (^js [node-factory node tag-name name bracketed? type-expression]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed? type-expression))
  (^js [node-factory node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed? type-expression name-first?))
  (^js [node-factory node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-property-tag
  (^js [node-factory]
   (.createJSDocPropertyTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocPropertyTag ^js node-factory tag-name))
  (^js [node-factory tag-name name]
   (.createJSDocPropertyTag ^js node-factory tag-name name))
  (^js [node-factory tag-name name bracketed?]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed?))
  (^js [node-factory tag-name name bracketed? type-expression]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed? type-expression))
  (^js [node-factory tag-name name bracketed? type-expression name-first?]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed? type-expression name-first?))
  (^js [node-factory tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed? type-expression name-first? comment)))

(defn update-js-doc-property-tag
  (^js [node-factory node]
   (.updateJSDocPropertyTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocPropertyTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name name]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name))
  (^js [node-factory node tag-name name bracketed?]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed?))
  (^js [node-factory node tag-name name bracketed? type-expression]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed? type-expression))
  (^js [node-factory node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed? type-expression name-first?))
  (^js [node-factory node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-type-tag
  (^js [node-factory]
   (.createJSDocTypeTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocTypeTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocTypeTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocTypeTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-type-tag
  (^js [node-factory node]
   (.updateJSDocTypeTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocTypeTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocTypeTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocTypeTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-see-tag
  (^js [node-factory]
   (.createJSDocSeeTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocSeeTag ^js node-factory tag-name))
  (^js [node-factory tag-name name-expression]
   (.createJSDocSeeTag ^js node-factory tag-name name-expression))
  (^js [node-factory tag-name name-expression comment]
   (.createJSDocSeeTag ^js node-factory tag-name name-expression comment)))

(defn update-js-doc-see-tag
  (^js [node-factory node]
   (.updateJSDocSeeTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocSeeTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name name-expression]
   (.updateJSDocSeeTag ^js node-factory node tag-name name-expression))
  (^js [node-factory node tag-name name-expression comment]
   (.updateJSDocSeeTag ^js node-factory node tag-name name-expression comment)))

(defn create-js-doc-return-tag
  (^js [node-factory]
   (.createJSDocReturnTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocReturnTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocReturnTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocReturnTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-return-tag
  (^js [node-factory node]
   (.updateJSDocReturnTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocReturnTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocReturnTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocReturnTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-this-tag
  (^js [node-factory]
   (.createJSDocThisTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocThisTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocThisTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocThisTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-this-tag
  (^js [node-factory node]
   (.updateJSDocThisTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocThisTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocThisTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocThisTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-enum-tag
  (^js [node-factory]
   (.createJSDocEnumTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocEnumTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocEnumTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocEnumTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-enum-tag
  (^js [node-factory node]
   (.updateJSDocEnumTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocEnumTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocEnumTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocEnumTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-callback-tag
  (^js [node-factory]
   (.createJSDocCallbackTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocCallbackTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocCallbackTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression full-name]
   (.createJSDocCallbackTag ^js node-factory tag-name type-expression full-name))
  (^js [node-factory tag-name type-expression full-name comment]
   (.createJSDocCallbackTag ^js node-factory tag-name type-expression full-name comment)))

(defn update-js-doc-callback-tag
  (^js [node-factory node]
   (.updateJSDocCallbackTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocCallbackTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocCallbackTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression full-name]
   (.updateJSDocCallbackTag ^js node-factory node tag-name type-expression full-name))
  (^js [node-factory node tag-name type-expression full-name comment]
   (.updateJSDocCallbackTag ^js node-factory node tag-name type-expression full-name comment)))

(defn create-js-doc-augments-tag
  (^js [node-factory]
   (.createJSDocAugmentsTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocAugmentsTag ^js node-factory tag-name))
  (^js [node-factory tag-name class-name]
   (.createJSDocAugmentsTag ^js node-factory tag-name class-name))
  (^js [node-factory tag-name class-name comment]
   (.createJSDocAugmentsTag ^js node-factory tag-name class-name comment)))

(defn update-js-doc-augments-tag
  (^js [node-factory node]
   (.updateJSDocAugmentsTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocAugmentsTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name class-name]
   (.updateJSDocAugmentsTag ^js node-factory node tag-name class-name))
  (^js [node-factory node tag-name class-name comment]
   (.updateJSDocAugmentsTag ^js node-factory node tag-name class-name comment)))

(defn create-js-doc-implements-tag
  (^js [node-factory]
   (.createJSDocImplementsTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocImplementsTag ^js node-factory tag-name))
  (^js [node-factory tag-name class-name]
   (.createJSDocImplementsTag ^js node-factory tag-name class-name))
  (^js [node-factory tag-name class-name comment]
   (.createJSDocImplementsTag ^js node-factory tag-name class-name comment)))

(defn update-js-doc-implements-tag
  (^js [node-factory node]
   (.updateJSDocImplementsTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocImplementsTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name class-name]
   (.updateJSDocImplementsTag ^js node-factory node tag-name class-name))
  (^js [node-factory node tag-name class-name comment]
   (.updateJSDocImplementsTag ^js node-factory node tag-name class-name comment)))

(defn create-js-doc-author-tag
  (^js [node-factory]
   (.createJSDocAuthorTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocAuthorTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocAuthorTag ^js node-factory tag-name comment)))

(defn update-js-doc-author-tag
  (^js [node-factory node]
   (.updateJSDocAuthorTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocAuthorTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocAuthorTag ^js node-factory node tag-name comment)))

(defn create-js-doc-class-tag
  (^js [node-factory]
   (.createJSDocClassTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocClassTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocClassTag ^js node-factory tag-name comment)))

(defn update-js-doc-class-tag
  (^js [node-factory node]
   (.updateJSDocClassTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocClassTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocClassTag ^js node-factory node tag-name comment)))

(defn create-js-doc-public-tag
  (^js [node-factory]
   (.createJSDocPublicTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocPublicTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocPublicTag ^js node-factory tag-name comment)))

(defn update-js-doc-public-tag
  (^js [node-factory node]
   (.updateJSDocPublicTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocPublicTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocPublicTag ^js node-factory node tag-name comment)))

(defn create-js-doc-private-tag
  (^js [node-factory]
   (.createJSDocPrivateTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocPrivateTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocPrivateTag ^js node-factory tag-name comment)))

(defn update-js-doc-private-tag
  (^js [node-factory node]
   (.updateJSDocPrivateTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocPrivateTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocPrivateTag ^js node-factory node tag-name comment)))

(defn create-js-doc-protected-tag
  (^js [node-factory]
   (.createJSDocProtectedTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocProtectedTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocProtectedTag ^js node-factory tag-name comment)))

(defn update-js-doc-protected-tag
  (^js [node-factory node]
   (.updateJSDocProtectedTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocProtectedTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocProtectedTag ^js node-factory node tag-name comment)))

(defn create-js-doc-readonly-tag
  (^js [node-factory]
   (.createJSDocReadonlyTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocReadonlyTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocReadonlyTag ^js node-factory tag-name comment)))

(defn update-js-doc-readonly-tag
  (^js [node-factory node]
   (.updateJSDocReadonlyTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocReadonlyTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocReadonlyTag ^js node-factory node tag-name comment)))

(defn create-js-doc-unknown-tag
  (^js [node-factory tag-name]
   (.createJSDocUnknownTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocUnknownTag ^js node-factory tag-name comment)))

(defn update-js-doc-unknown-tag
  (^js [node-factory node tag-name]
   (.updateJSDocUnknownTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocUnknownTag ^js node-factory node tag-name comment)))

(defn create-js-doc-deprecated-tag
  (^js [node-factory tag-name]
   (.createJSDocDeprecatedTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocDeprecatedTag ^js node-factory tag-name comment)))

(defn update-js-doc-deprecated-tag
  (^js [node-factory node tag-name]
   (.updateJSDocDeprecatedTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocDeprecatedTag ^js node-factory node tag-name comment)))

(defn create-js-doc-override-tag
  (^js [node-factory tag-name]
   (.createJSDocOverrideTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocOverrideTag ^js node-factory tag-name comment)))

(defn update-js-doc-override-tag
  (^js [node-factory node tag-name]
   (.updateJSDocOverrideTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocOverrideTag ^js node-factory node tag-name comment)))

(defn create-js-doc-text
  ^js [node-factory text]
  (.createJSDocText ^js node-factory text))

(defn update-js-doc-text
  ^js [node-factory node text]
  (.updateJSDocText ^js node-factory node text))

(defn create-js-doc-comment
  (^js [node-factory]
   (.createJSDocComment ^js node-factory))
  (^js [node-factory comment]
   (.createJSDocComment ^js node-factory comment))
  (^js [node-factory comment tags]
   (.createJSDocComment ^js node-factory comment tags)))

(defn update-js-doc-comment
  (^js [node-factory node]
   (.updateJSDocComment ^js node-factory node))
  (^js [node-factory node comment]
   (.updateJSDocComment ^js node-factory node comment))
  (^js [node-factory node comment tags]
   (.updateJSDocComment ^js node-factory node comment tags)))

(defn create-jsx-element
  ^js [node-factory opening-element children closing-element]
  (.createJsxElement ^js node-factory opening-element children closing-element))

(defn update-jsx-element
  ^js [node-factory node opening-element children closing-element]
  (.updateJsxElement ^js node-factory node opening-element children closing-element))

(defn create-jsx-self-closing-element
  (^js [node-factory tag-name]
   (.createJsxSelfClosingElement ^js node-factory tag-name))
  (^js [node-factory tag-name type-arguments]
   (.createJsxSelfClosingElement ^js node-factory tag-name type-arguments))
  (^js [node-factory tag-name type-arguments attributes]
   (.createJsxSelfClosingElement ^js node-factory tag-name type-arguments attributes)))

(defn update-jsx-self-closing-element
  (^js [node-factory node tag-name]
   (.updateJsxSelfClosingElement ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-arguments]
   (.updateJsxSelfClosingElement ^js node-factory node tag-name type-arguments))
  (^js [node-factory node tag-name type-arguments attributes]
   (.updateJsxSelfClosingElement ^js node-factory node tag-name type-arguments attributes)))

(defn create-jsx-opening-element
  (^js [node-factory tag-name]
   (.createJsxOpeningElement ^js node-factory tag-name))
  (^js [node-factory tag-name type-arguments]
   (.createJsxOpeningElement ^js node-factory tag-name type-arguments))
  (^js [node-factory tag-name type-arguments attributes]
   (.createJsxOpeningElement ^js node-factory tag-name type-arguments attributes)))

(defn update-jsx-opening-element
  (^js [node-factory node tag-name]
   (.updateJsxOpeningElement ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-arguments]
   (.updateJsxOpeningElement ^js node-factory node tag-name type-arguments))
  (^js [node-factory node tag-name type-arguments attributes]
   (.updateJsxOpeningElement ^js node-factory node tag-name type-arguments attributes)))

(defn create-jsx-closing-element
  ^js [node-factory tag-name]
  (.createJsxClosingElement ^js node-factory tag-name))

(defn update-jsx-closing-element
  ^js [node-factory node tag-name]
  (.updateJsxClosingElement ^js node-factory node tag-name))

(defn create-jsx-fragment
  ^js [node-factory opening-fragment children closing-fragment]
  (.createJsxFragment ^js node-factory opening-fragment children closing-fragment))

(defn create-jsx-text
  (^js [node-factory text]
   (.createJsxText ^js node-factory text))
  (^js [node-factory text contains-only-trivia-white-spaces?]
   (.createJsxText ^js node-factory text contains-only-trivia-white-spaces?)))

(defn update-jsx-text
  (^js [node-factory node text]
   (.updateJsxText ^js node-factory node text))
  (^js [node-factory node text contains-only-trivia-white-spaces?]
   (.updateJsxText ^js node-factory node text contains-only-trivia-white-spaces?)))

(defn create-jsx-opening-fragment
  ^js [node-factory]
  (.createJsxOpeningFragment ^js node-factory))

(defn create-jsx-jsx-closing-fragment
  ^js [node-factory]
  (.createJsxJsxClosingFragment ^js node-factory))

(defn update-jsx-fragment
  ^js [node-factory node opening-fragment children closing-fragment]
  (.updateJsxFragment ^js node-factory node opening-fragment children closing-fragment))

(defn create-jsx-attribute
  (^js [node-factory name]
   (.createJsxAttribute ^js node-factory name))
  (^js [node-factory name initializer]
   (.createJsxAttribute ^js node-factory name initializer)))

(defn update-jsx-attribute
  (^js [node-factory node name]
   (.updateJsxAttribute ^js node-factory node name))
  (^js [node-factory node name initializer]
   (.updateJsxAttribute ^js node-factory node name initializer)))

(defn create-jsx-attributes
  ^js [node-factory properties]
  (.createJsxAttributes ^js node-factory properties))

(defn update-jsx-attributes
  ^js [node-factory node properties]
  (.updateJsxAttributes ^js node-factory node properties))

(defn create-jsx-spread-attribute
  ^js [node-factory expression]
  (.createJsxSpreadAttribute ^js node-factory expression))

(defn update-jsx-spread-attribute
  ^js [node-factory node expression]
  (.updateJsxSpreadAttribute ^js node-factory node expression))

(defn create-jsx-expression
  (^js [node-factory]
   (.createJsxExpression ^js node-factory))
  (^js [node-factory dot-dot-dot-token]
   (.createJsxExpression ^js node-factory dot-dot-dot-token))
  (^js [node-factory dot-dot-dot-token expression]
   (.createJsxExpression ^js node-factory dot-dot-dot-token expression)))

(defn update-jsx-expression
  (^js [node-factory node]
   (.updateJsxExpression ^js node-factory node))
  (^js [node-factory node expression]
   (.updateJsxExpression ^js node-factory node expression)))

(defn create-case-clause
  ^js [node-factory expression statements]
  (.createCaseClause ^js node-factory expression statements))

(defn update-case-clause
  ^js [node-factory node expression statements]
  (.updateCaseClause ^js node-factory node expression statements))

(defn create-default-clause
  ^js [node-factory statements]
  (.createDefaultClause ^js node-factory statements))

(defn update-default-clause
  ^js [node-factory node statements]
  (.updateDefaultClause ^js node-factory node statements))

(defn create-heritage-clause
  ^js [node-factory token types]
  (.createHeritageClause ^js node-factory token types))

(defn update-heritage-clause
  ^js [node-factory node types]
  (.updateHeritageClause ^js node-factory node types))

(defn create-catch-clause
  (^js [node-factory]
   (.createCatchClause ^js node-factory))
  (^js [node-factory variable-declaration]
   (.createCatchClause ^js node-factory variable-declaration))
  (^js [node-factory variable-declaration block]
   (.createCatchClause ^js node-factory variable-declaration block)))

(defn update-catch-clause
  (^js [node-factory node]
   (.updateCatchClause ^js node-factory node))
  (^js [node-factory node variable-declaration]
   (.updateCatchClause ^js node-factory node variable-declaration))
  (^js [node-factory node variable-declaration block]
   (.updateCatchClause ^js node-factory node variable-declaration block)))

(defn create-property-assignment
  ^js [node-factory name initializer]
  (.createPropertyAssignment ^js node-factory name initializer))

(defn update-property-assignment
  ^js [node-factory node name initializer]
  (.updatePropertyAssignment ^js node-factory node name initializer))

(defn create-shorthand-property-assignment
  (^js [node-factory name]
   (.createShorthandPropertyAssignment ^js node-factory name))
  (^js [node-factory name object-assignment-initializer]
   (.createShorthandPropertyAssignment ^js node-factory name object-assignment-initializer)))

(defn update-shorthand-property-assignment
  (^js [node-factory node name]
   (.updateShorthandPropertyAssignment ^js node-factory node name))
  (^js [node-factory node name object-assignment-initializer]
   (.updateShorthandPropertyAssignment ^js node-factory node name object-assignment-initializer)))

(defn create-spread-assignment
  ^js [node-factory expression]
  (.createSpreadAssignment ^js node-factory expression))

(defn update-spread-assignment
  ^js [node-factory node expression]
  (.updateSpreadAssignment ^js node-factory node expression))

(defn create-enum-member
  (^js [node-factory name]
   (.createEnumMember ^js node-factory name))
  (^js [node-factory name initializer]
   (.createEnumMember ^js node-factory name initializer)))

(defn update-enum-member
  (^js [node-factory node name]
   (.updateEnumMember ^js node-factory node name))
  (^js [node-factory node name initializer]
   (.updateEnumMember ^js node-factory node name initializer)))

(defn create-source-file
  ^js [node-factory statements end-of-file-token flags]
  (.createSourceFile ^js node-factory statements end-of-file-token flags))

(defn update-source-file
  (^js [node-factory node statements]
   (.updateSourceFile ^js node-factory node statements))
  (^js [node-factory node statements declaration-file?]
   (.updateSourceFile ^js node-factory node statements declaration-file?))
  (^js [node-factory node statements declaration-file? referenced-files]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files))
  (^js [node-factory node statements declaration-file? referenced-files type-references]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files type-references))
  (^js [node-factory node statements declaration-file? referenced-files type-references has-no-default-lib?]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files type-references has-no-default-lib?))
  (^js [node-factory node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references)))

(defn create-not-emitted-statement
  ^js [node-factory original]
  (.createNotEmittedStatement ^js node-factory original))

(defn create-partially-emitted-expression
  (^js [node-factory expression]
   (.createPartiallyEmittedExpression ^js node-factory expression))
  (^js [node-factory expression original]
   (.createPartiallyEmittedExpression ^js node-factory expression original)))

(defn update-partially-emitted-expression
  ^js [node-factory node expression]
  (.updatePartiallyEmittedExpression ^js node-factory node expression))

(defn create-comma-list-expression
  ^js [node-factory elements]
  (.createCommaListExpression ^js node-factory elements))

(defn update-comma-list-expression
  ^js [node-factory node elements]
  (.updateCommaListExpression ^js node-factory node elements))

(defn create-bundle
  (^js [node-factory source-files]
   (.createBundle ^js node-factory source-files))
  (^js [node-factory source-files prepends]
   (.createBundle ^js node-factory source-files prepends)))

(defn update-bundle
  (^js [node-factory node source-files]
   (.updateBundle ^js node-factory node source-files))
  (^js [node-factory node source-files prepends]
   (.updateBundle ^js node-factory node source-files prepends)))

(defn create-comma
  ^js [node-factory left right]
  (.createComma ^js node-factory left right))

(defn create-assignment
  ^js [node-factory left right]
  (.createAssignment ^js node-factory left right))

(defn create-logical-or
  ^js [node-factory left right]
  (.createLogicalOr ^js node-factory left right))

(defn create-logical-and
  ^js [node-factory left right]
  (.createLogicalAnd ^js node-factory left right))

(defn create-bitwise-or
  ^js [node-factory left right]
  (.createBitwiseOr ^js node-factory left right))

(defn create-bitwise-xor
  ^js [node-factory left right]
  (.createBitwiseXor ^js node-factory left right))

(defn create-bitwise-and
  ^js [node-factory left right]
  (.createBitwiseAnd ^js node-factory left right))

(defn create-strict-equality
  ^js [node-factory left right]
  (.createStrictEquality ^js node-factory left right))

(defn create-strict-inequality
  ^js [node-factory left right]
  (.createStrictInequality ^js node-factory left right))

(defn create-equality
  ^js [node-factory left right]
  (.createEquality ^js node-factory left right))

(defn create-inequality
  ^js [node-factory left right]
  (.createInequality ^js node-factory left right))

(defn create-less-than
  ^js [node-factory left right]
  (.createLessThan ^js node-factory left right))

(defn create-less-than-equals
  ^js [node-factory left right]
  (.createLessThanEquals ^js node-factory left right))

(defn create-greater-than
  ^js [node-factory left right]
  (.createGreaterThan ^js node-factory left right))

(defn create-greater-than-equals
  ^js [node-factory left right]
  (.createGreaterThanEquals ^js node-factory left right))

(defn create-left-shift
  ^js [node-factory left right]
  (.createLeftShift ^js node-factory left right))

(defn create-right-shift
  ^js [node-factory left right]
  (.createRightShift ^js node-factory left right))

(defn create-unsigned-right-shift
  ^js [node-factory left right]
  (.createUnsignedRightShift ^js node-factory left right))

(defn create-add
  ^js [node-factory left right]
  (.createAdd ^js node-factory left right))

(defn create-subtract
  ^js [node-factory left right]
  (.createSubtract ^js node-factory left right))

(defn create-multiply
  ^js [node-factory left right]
  (.createMultiply ^js node-factory left right))

(defn create-divide
  ^js [node-factory left right]
  (.createDivide ^js node-factory left right))

(defn create-modulo
  ^js [node-factory left right]
  (.createModulo ^js node-factory left right))

(defn create-exponent
  ^js [node-factory left right]
  (.createExponent ^js node-factory left right))

(defn create-prefix-plus
  ^js [node-factory operand]
  (.createPrefixPlus ^js node-factory operand))

(defn create-prefix-minus
  ^js [node-factory operand]
  (.createPrefixMinus ^js node-factory operand))

(defn create-prefix-increment
  ^js [node-factory operand]
  (.createPrefixIncrement ^js node-factory operand))

(defn create-prefix-decrement
  ^js [node-factory operand]
  (.createPrefixDecrement ^js node-factory operand))

(defn create-bitwise-not
  ^js [node-factory operand]
  (.createBitwiseNot ^js node-factory operand))

(defn create-logical-not
  ^js [node-factory operand]
  (.createLogicalNot ^js node-factory operand))

(defn create-postfix-increment
  ^js [node-factory operand]
  (.createPostfixIncrement ^js node-factory operand))

(defn create-postfix-decrement
  ^js [node-factory operand]
  (.createPostfixDecrement ^js node-factory operand))

(defn create-immediately-invoked-function-expression
  (^js [node-factory statements]
   (.createImmediatelyInvokedFunctionExpression ^js node-factory statements))
  (^js [node-factory statements param param-value]
   (.createImmediatelyInvokedFunctionExpression ^js node-factory statements param param-value)))

(defn create-immediately-invoked-arrow-function
  (^js [node-factory statements]
   (.createImmediatelyInvokedArrowFunction ^js node-factory statements))
  (^js [node-factory statements param param-value]
   (.createImmediatelyInvokedArrowFunction ^js node-factory statements param param-value)))

(defn create-void-zero
  ^js [node-factory]
  (.createVoidZero ^js node-factory))

(defn create-export-default
  ^js [node-factory expression]
  (.createExportDefault ^js node-factory expression))

(defn create-external-module-export
  ^js [node-factory export-name]
  (.createExternalModuleExport ^js node-factory export-name))

(defn restore-outer-expressions
  (^js [node-factory]
   (.restoreOuterExpressions ^js node-factory))
  (^js [node-factory outer-expression]
   (.restoreOuterExpressions ^js node-factory outer-expression))
  (^js [node-factory outer-expression inner-expression]
   (.restoreOuterExpressions ^js node-factory outer-expression inner-expression))
  (^js [node-factory outer-expression inner-expression kinds]
   (.restoreOuterExpressions ^js node-factory outer-expression inner-expression kinds)))
