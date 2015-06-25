﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using System.Linq;
using Fixtures.SwaggerBatBodyArray.Models;
using Fixtures.SwaggerBatBodyDictionary.Models;

namespace Microsoft.Rest.Generator.CSharp.Tests
{
    /// <summary>
    /// Enables comparing byte arrays when checking sequence and dictionary equality
    /// </summary>
    internal class ByteArrayEqualityComparer : IEqualityComparer<byte[]>
    {
        public bool Equals(byte[] x, byte[] y)
        {
            return (x == null && y == null) || x.SequenceEqual(y);
        }

        public int GetHashCode(byte[] obj)
        {
            return obj.GetHashCode();
        }
    }

    /// <summary>
    /// Enables comparing Products when checking sequence and dictionary equality
    /// </summary>
    internal class ProductEqualityComparer : IEqualityComparer<Product>
    {
        public bool Equals(Product x, Product y)
        {
            return (x == null && y == null) ||
                   ((x != null && y != null) &&
                    (x.StringProperty == y.StringProperty && x.Integer == y.Integer));
        }

        public int GetHashCode(Product obj)
        {
            return obj.GetHashCode();
        }
    }

    /// <summary>
    /// Enables comparing Products when checking sequence and dictionary equality
    /// </summary>
    internal class WidgetEqualityComparer : IEqualityComparer<Widget>
    {
        public bool Equals(Widget x, Widget y)
        {
            return (x == null && y == null) ||
                   ((x != null && y != null) &&
                    (x.StringProperty == y.StringProperty && x.Integer == y.Integer));
        }

        public int GetHashCode(Widget obj)
        {
            return obj.GetHashCode();
        }
    }

    /// <summary>
    /// Enables comparing Products when checking sequence and dictionary equality
    /// </summary>
    internal class ListEqualityComparer<T> : IEqualityComparer<IList<T>>
    {
        public bool Equals(IList<T> x, IList<T> y)
        {
            return (x == null && y == null) ||
                   ((x != null && y != null) &&
                    x.SequenceEqual(y));
        }

        public int GetHashCode(IList<T> obj)
        {
            return obj.GetHashCode();
        }
    }

    /// <summary>
    /// Enables comparing Products when checking sequence and dictionary equality
    /// </summary>
    internal class DictionaryEqualityComparer<T> : IEqualityComparer<IDictionary<string, T>>
    {
        public bool Equals(IDictionary<string, T> x, IDictionary<string, T> y)
        {
            return (x == null && y == null) ||
                   (x != null && y != null && x.Keys.All(k => y.ContainsKey(k) && y[k].Equals(x[k])));
        }

        public int GetHashCode(IDictionary<string, T> obj)
        {
            return obj.GetHashCode();
        }
    }
}