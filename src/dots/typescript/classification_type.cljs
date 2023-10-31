(ns dots.typescript.classification-type
  (:refer-clojure :exclude [comment keyword])
  (:require ["typescript" :as typescript]))

(def comment (.-comment typescript/ClassificationType))

(def identifier (.-identifier typescript/ClassificationType))

(def keyword (.-keyword typescript/ClassificationType))

(def numeric-literal (.-numericLiteral typescript/ClassificationType))

(def operator (.-operator typescript/ClassificationType))

(def string-literal (.-stringLiteral typescript/ClassificationType))

(def regular-expression-literal (.-regularExpressionLiteral typescript/ClassificationType))

(def white-space (.-whiteSpace typescript/ClassificationType))

(def text (.-text typescript/ClassificationType))

(def punctuation (.-punctuation typescript/ClassificationType))

(def class-name (.-className typescript/ClassificationType))

(def enum-name (.-enumName typescript/ClassificationType))

(def interface-name (.-interfaceName typescript/ClassificationType))

(def module-name (.-moduleName typescript/ClassificationType))

(def type-parameter-name (.-typeParameterName typescript/ClassificationType))

(def type-alias-name (.-typeAliasName typescript/ClassificationType))

(def parameter-name (.-parameterName typescript/ClassificationType))

(def doc-comment-tag-name (.-docCommentTagName typescript/ClassificationType))

(def jsx-open-tag-name (.-jsxOpenTagName typescript/ClassificationType))

(def jsx-close-tag-name (.-jsxCloseTagName typescript/ClassificationType))

(def jsx-self-closing-tag-name (.-jsxSelfClosingTagName typescript/ClassificationType))

(def jsx-attribute (.-jsxAttribute typescript/ClassificationType))

(def jsx-text (.-jsxText typescript/ClassificationType))

(def jsx-attribute-string-literal-value (.-jsxAttributeStringLiteralValue typescript/ClassificationType))

(def bigint-literal (.-bigintLiteral typescript/ClassificationType))
