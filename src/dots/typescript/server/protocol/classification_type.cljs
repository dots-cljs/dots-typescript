(ns dots.typescript.server.protocol.classification-type
  (:refer-clojure :exclude [comment keyword])
  (:require ["typescript" :as typescript]))

(def comment (.. typescript/server -protocol -ClassificationType -comment))

(def identifier (.. typescript/server -protocol -ClassificationType -identifier))

(def keyword (.. typescript/server -protocol -ClassificationType -keyword))

(def numeric-literal (.. typescript/server -protocol -ClassificationType -numericLiteral))

(def operator (.. typescript/server -protocol -ClassificationType -operator))

(def string-literal (.. typescript/server -protocol -ClassificationType -stringLiteral))

(def regular-expression-literal (.. typescript/server -protocol -ClassificationType -regularExpressionLiteral))

(def white-space (.. typescript/server -protocol -ClassificationType -whiteSpace))

(def text (.. typescript/server -protocol -ClassificationType -text))

(def punctuation (.. typescript/server -protocol -ClassificationType -punctuation))

(def class-name (.. typescript/server -protocol -ClassificationType -className))

(def enum-name (.. typescript/server -protocol -ClassificationType -enumName))

(def interface-name (.. typescript/server -protocol -ClassificationType -interfaceName))

(def module-name (.. typescript/server -protocol -ClassificationType -moduleName))

(def type-parameter-name (.. typescript/server -protocol -ClassificationType -typeParameterName))

(def type-alias-name (.. typescript/server -protocol -ClassificationType -typeAliasName))

(def parameter-name (.. typescript/server -protocol -ClassificationType -parameterName))

(def doc-comment-tag-name (.. typescript/server -protocol -ClassificationType -docCommentTagName))

(def jsx-open-tag-name (.. typescript/server -protocol -ClassificationType -jsxOpenTagName))

(def jsx-close-tag-name (.. typescript/server -protocol -ClassificationType -jsxCloseTagName))

(def jsx-self-closing-tag-name (.. typescript/server -protocol -ClassificationType -jsxSelfClosingTagName))

(def jsx-attribute (.. typescript/server -protocol -ClassificationType -jsxAttribute))

(def jsx-text (.. typescript/server -protocol -ClassificationType -jsxText))

(def jsx-attribute-string-literal-value (.. typescript/server -protocol -ClassificationType -jsxAttributeStringLiteralValue))

(def bigint-literal (.. typescript/server -protocol -ClassificationType -bigintLiteral))
